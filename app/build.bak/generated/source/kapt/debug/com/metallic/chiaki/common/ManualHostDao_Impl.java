package com.metallic.chiaki.common;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.metallic.chiaki.lib.Target;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ManualHostDao_Impl implements ManualHostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ManualHost> __insertionAdapterOfManualHost;

  private final EntityDeletionOrUpdateAdapter<ManualHost> __deletionAdapterOfManualHost;

  private final EntityDeletionOrUpdateAdapter<ManualHost> __updateAdapterOfManualHost;

  private final SharedSQLiteStatement __preparedStmtOfAssignRegisteredHost;

  private final Converters __converters = new Converters();

  public ManualHostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
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
    this.__deletionAdapterOfManualHost = new EntityDeletionOrUpdateAdapter<ManualHost>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `manual_host` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ManualHost value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfManualHost = new EntityDeletionOrUpdateAdapter<ManualHost>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `manual_host` SET `id` = ?,`host` = ?,`registered_host` = ? WHERE `id` = ?";
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
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfAssignRegisteredHost = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE manual_host SET registered_host = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Completable insert(final ManualHost host) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfManualHost.insert(host);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final ManualHost host) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfManualHost.handle(host);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final ManualHost host) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfManualHost.handle(host);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable assignRegisteredHost(final long manualHostId, final Long registeredHostId) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfAssignRegisteredHost.acquire();
        int _argIndex = 1;
        if (registeredHostId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindLong(_argIndex, registeredHostId);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, manualHostId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfAssignRegisteredHost.release(_stmt);
        }
      }
    });
  }

  @Override
  public Single<ManualHost> getById(final long id) {
    final String _sql = "SELECT * FROM manual_host WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<ManualHost>() {
      @Override
      public ManualHost call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfHost = CursorUtil.getColumnIndexOrThrow(_cursor, "host");
          final int _cursorIndexOfRegisteredHost = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_host");
          final ManualHost _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpHost;
            _tmpHost = _cursor.getString(_cursorIndexOfHost);
            final Long _tmpRegisteredHost;
            if (_cursor.isNull(_cursorIndexOfRegisteredHost)) {
              _tmpRegisteredHost = null;
            } else {
              _tmpRegisteredHost = _cursor.getLong(_cursorIndexOfRegisteredHost);
            }
            _result = new ManualHost(_tmpId,_tmpHost,_tmpRegisteredHost);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<ManualHostAndRegisteredHost> getByIdWithRegisteredHost(final long id) {
    final String _sql = "SELECT\n"
            + "\t\t\tmanual_host.id as manual_host_id,\n"
            + "\t\t\tmanual_host.host as manual_host_host,\n"
            + "\t\t\tmanual_host.registered_host as manual_host_registered_host,\n"
            + "\t\t\tregistered_host.*\n"
            + "\t\tFROM manual_host LEFT OUTER JOIN registered_host ON manual_host.registered_host = registered_host.id WHERE manual_host.id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<ManualHostAndRegisteredHost>() {
      @Override
      public ManualHostAndRegisteredHost call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "manual_host_id");
          final int _cursorIndexOfHost = CursorUtil.getColumnIndexOrThrow(_cursor, "manual_host_host");
          final int _cursorIndexOfRegisteredHost = CursorUtil.getColumnIndexOrThrow(_cursor, "manual_host_registered_host");
          final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTarget = CursorUtil.getColumnIndexOrThrow(_cursor, "target");
          final int _cursorIndexOfApSsid = CursorUtil.getColumnIndexOrThrow(_cursor, "ap_ssid");
          final int _cursorIndexOfApBssid = CursorUtil.getColumnIndexOrThrow(_cursor, "ap_bssid");
          final int _cursorIndexOfApKey = CursorUtil.getColumnIndexOrThrow(_cursor, "ap_key");
          final int _cursorIndexOfApName = CursorUtil.getColumnIndexOrThrow(_cursor, "ap_name");
          final int _cursorIndexOfServerMac = CursorUtil.getColumnIndexOrThrow(_cursor, "server_mac");
          final int _cursorIndexOfServerNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "server_nickname");
          final int _cursorIndexOfRpRegistKey = CursorUtil.getColumnIndexOrThrow(_cursor, "rp_regist_key");
          final int _cursorIndexOfRpKeyType = CursorUtil.getColumnIndexOrThrow(_cursor, "rp_key_type");
          final int _cursorIndexOfRpKey = CursorUtil.getColumnIndexOrThrow(_cursor, "rp_key");
          final ManualHostAndRegisteredHost _result;
          if(_cursor.moveToFirst()) {
            final ManualHost _tmpManualHost;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfHost) && _cursor.isNull(_cursorIndexOfRegisteredHost))) {
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final String _tmpHost;
              _tmpHost = _cursor.getString(_cursorIndexOfHost);
              final Long _tmpRegisteredHost_1;
              if (_cursor.isNull(_cursorIndexOfRegisteredHost)) {
                _tmpRegisteredHost_1 = null;
              } else {
                _tmpRegisteredHost_1 = _cursor.getLong(_cursorIndexOfRegisteredHost);
              }
              _tmpManualHost = new ManualHost(_tmpId,_tmpHost,_tmpRegisteredHost_1);
            }  else  {
              _tmpManualHost = null;
            }
            final RegisteredHost _tmpRegisteredHost;
            if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfTarget) && _cursor.isNull(_cursorIndexOfApSsid) && _cursor.isNull(_cursorIndexOfApBssid) && _cursor.isNull(_cursorIndexOfApKey) && _cursor.isNull(_cursorIndexOfApName) && _cursor.isNull(_cursorIndexOfServerMac) && _cursor.isNull(_cursorIndexOfServerNickname) && _cursor.isNull(_cursorIndexOfRpRegistKey) && _cursor.isNull(_cursorIndexOfRpKeyType) && _cursor.isNull(_cursorIndexOfRpKey))) {
              final long _tmpId_1;
              _tmpId_1 = _cursor.getLong(_cursorIndexOfId_1);
              final Target _tmpTarget;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfTarget);
              _tmpTarget = __converters.targetFromValue(_tmp);
              final String _tmpApSsid;
              _tmpApSsid = _cursor.getString(_cursorIndexOfApSsid);
              final String _tmpApBssid;
              _tmpApBssid = _cursor.getString(_cursorIndexOfApBssid);
              final String _tmpApKey;
              _tmpApKey = _cursor.getString(_cursorIndexOfApKey);
              final String _tmpApName;
              _tmpApName = _cursor.getString(_cursorIndexOfApName);
              final MacAddress _tmpServerMac;
              final long _tmp_1;
              _tmp_1 = _cursor.getLong(_cursorIndexOfServerMac);
              _tmpServerMac = __converters.macFromValue(_tmp_1);
              final String _tmpServerNickname;
              _tmpServerNickname = _cursor.getString(_cursorIndexOfServerNickname);
              final byte[] _tmpRpRegistKey;
              _tmpRpRegistKey = _cursor.getBlob(_cursorIndexOfRpRegistKey);
              final int _tmpRpKeyType;
              _tmpRpKeyType = _cursor.getInt(_cursorIndexOfRpKeyType);
              final byte[] _tmpRpKey;
              _tmpRpKey = _cursor.getBlob(_cursorIndexOfRpKey);
              _tmpRegisteredHost = new RegisteredHost(_tmpId_1,_tmpTarget,_tmpApSsid,_tmpApBssid,_tmpApKey,_tmpApName,_tmpServerMac,_tmpServerNickname,_tmpRpRegistKey,_tmpRpKeyType,_tmpRpKey);
            }  else  {
              _tmpRegisteredHost = null;
            }
            _result = new ManualHostAndRegisteredHost(_tmpManualHost,_tmpRegisteredHost);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<ManualHost>> getAll() {
    final String _sql = "SELECT * FROM manual_host";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"manual_host"}, new Callable<List<ManualHost>>() {
      @Override
      public List<ManualHost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfHost = CursorUtil.getColumnIndexOrThrow(_cursor, "host");
          final int _cursorIndexOfRegisteredHost = CursorUtil.getColumnIndexOrThrow(_cursor, "registered_host");
          final List<ManualHost> _result = new ArrayList<ManualHost>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ManualHost _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpHost;
            _tmpHost = _cursor.getString(_cursorIndexOfHost);
            final Long _tmpRegisteredHost;
            if (_cursor.isNull(_cursorIndexOfRegisteredHost)) {
              _tmpRegisteredHost = null;
            } else {
              _tmpRegisteredHost = _cursor.getLong(_cursorIndexOfRegisteredHost);
            }
            _item = new ManualHost(_tmpId,_tmpHost,_tmpRegisteredHost);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
