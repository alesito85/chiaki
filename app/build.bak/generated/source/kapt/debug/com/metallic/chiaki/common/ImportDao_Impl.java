package com.metallic.chiaki.common;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ImportDao_Impl extends ImportDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RegisteredHost> __insertionAdapterOfRegisteredHost;

  private final Converters __converters = new Converters();

  private final EntityInsertionAdapter<ManualHost> __insertionAdapterOfManualHost;

  public ImportDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRegisteredHost = new EntityInsertionAdapter<RegisteredHost>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `registered_host` (`id`,`target`,`ap_ssid`,`ap_bssid`,`ap_key`,`ap_name`,`server_mac`,`server_nickname`,`rp_regist_key`,`rp_key_type`,`rp_key`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RegisteredHost value) {
        stmt.bindLong(1, value.getId());
        final int _tmp;
        _tmp = __converters.targetToValue(value.getTarget());
        stmt.bindLong(2, _tmp);
        if (value.getApSsid() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getApSsid());
        }
        if (value.getApBssid() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getApBssid());
        }
        if (value.getApKey() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getApKey());
        }
        if (value.getApName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getApName());
        }
        final long _tmp_1;
        _tmp_1 = __converters.macToValue(value.getServerMac());
        stmt.bindLong(7, _tmp_1);
        if (value.getServerNickname() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getServerNickname());
        }
        if (value.getRpRegistKey() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindBlob(9, value.getRpRegistKey());
        }
        stmt.bindLong(10, value.getRpKeyType());
        if (value.getRpKey() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindBlob(11, value.getRpKey());
        }
      }
    };
    this.__insertionAdapterOfManualHost = new EntityInsertionAdapter<ManualHost>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `manual_host` (`id`,`host`,`registered_host`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ManualHost value) {
        stmt.bindLong(1, value.getId());
        if (value.getHost() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHost());
        }
        if (value.getRegisteredHost() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getRegisteredHost());
        }
      }
    };
  }

  @Override
  public void insertRegisteredHosts(final List<RegisteredHost> hosts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRegisteredHost.insert(hosts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertManualHosts(final List<ManualHost> hosts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfManualHost.insert(hosts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ImportDao.IdWithMac> registeredHostsByMac(final List<MacAddress> macs) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT id, server_mac AS mac FROM registered_host WHERE server_mac IN (");
    final int _inputSize = macs.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (MacAddress _item : macs) {
      final long _tmp;
      _tmp = __converters.macToValue(_item);
      _statement.bindLong(_argIndex, _tmp);
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMac = CursorUtil.getColumnIndexOrThrow(_cursor, "mac");
      final List<ImportDao.IdWithMac> _result = new ArrayList<ImportDao.IdWithMac>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ImportDao.IdWithMac _item_1;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final MacAddress _tmpMac;
        final long _tmp_1;
        _tmp_1 = _cursor.getLong(_cursorIndexOfMac);
        _tmpMac = __converters.macFromValue(_tmp_1);
        _item_1 = new ImportDao.IdWithMac(_tmpId,_tmpMac);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
