package com.metallic.chiaki.common;

import android.database.Cursor;
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
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RegisteredHostDao_Impl implements RegisteredHostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RegisteredHost> __insertionAdapterOfRegisteredHost;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<RegisteredHost> __deletionAdapterOfRegisteredHost;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByMac;

  public RegisteredHostDao_Impl(RoomDatabase __db) {
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
    this.__deletionAdapterOfRegisteredHost = new EntityDeletionOrUpdateAdapter<RegisteredHost>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `registered_host` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RegisteredHost value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteByMac = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM registered_host WHERE server_mac == ?";
        return _query;
      }
    };
  }

  @Override
  public Single<Long> insert(final RegisteredHost host) {
    return Single.fromCallable(new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfRegisteredHost.insertAndReturnId(host);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final RegisteredHost host) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRegisteredHost.handle(host);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable deleteByMac(final MacAddress mac) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByMac.acquire();
        int _argIndex = 1;
        final long _tmp;
        _tmp = __converters.macToValue(mac);
        _stmt.bindLong(_argIndex, _tmp);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteByMac.release(_stmt);
        }
      }
    });
  }

  @Override
  public Flowable<List<RegisteredHost>> getAll() {
    final String _sql = "SELECT * FROM registered_host";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"registered_host"}, new Callable<List<RegisteredHost>>() {
      @Override
      public List<RegisteredHost> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
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
          final List<RegisteredHost> _result = new ArrayList<RegisteredHost>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RegisteredHost _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
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
            _item = new RegisteredHost(_tmpId,_tmpTarget,_tmpApSsid,_tmpApBssid,_tmpApKey,_tmpApName,_tmpServerMac,_tmpServerNickname,_tmpRpRegistKey,_tmpRpKeyType,_tmpRpKey);
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

  @Override
  public Maybe<RegisteredHost> getByMac(final MacAddress mac) {
    final String _sql = "SELECT * FROM registered_host WHERE server_mac == ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final long _tmp;
    _tmp = __converters.macToValue(mac);
    _statement.bindLong(_argIndex, _tmp);
    return Maybe.fromCallable(new Callable<RegisteredHost>() {
      @Override
      public RegisteredHost call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
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
          final RegisteredHost _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final Target _tmpTarget;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfTarget);
            _tmpTarget = __converters.targetFromValue(_tmp_1);
            final String _tmpApSsid;
            _tmpApSsid = _cursor.getString(_cursorIndexOfApSsid);
            final String _tmpApBssid;
            _tmpApBssid = _cursor.getString(_cursorIndexOfApBssid);
            final String _tmpApKey;
            _tmpApKey = _cursor.getString(_cursorIndexOfApKey);
            final String _tmpApName;
            _tmpApName = _cursor.getString(_cursorIndexOfApName);
            final MacAddress _tmpServerMac;
            final long _tmp_2;
            _tmp_2 = _cursor.getLong(_cursorIndexOfServerMac);
            _tmpServerMac = __converters.macFromValue(_tmp_2);
            final String _tmpServerNickname;
            _tmpServerNickname = _cursor.getString(_cursorIndexOfServerNickname);
            final byte[] _tmpRpRegistKey;
            _tmpRpRegistKey = _cursor.getBlob(_cursorIndexOfRpRegistKey);
            final int _tmpRpKeyType;
            _tmpRpKeyType = _cursor.getInt(_cursorIndexOfRpKeyType);
            final byte[] _tmpRpKey;
            _tmpRpKey = _cursor.getBlob(_cursorIndexOfRpKey);
            _result = new RegisteredHost(_tmpId,_tmpTarget,_tmpApSsid,_tmpApBssid,_tmpApKey,_tmpApName,_tmpServerMac,_tmpServerNickname,_tmpRpRegistKey,_tmpRpKeyType,_tmpRpKey);
          } else {
            _result = null;
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
  public Flowable<Integer> count() {
    final String _sql = "SELECT COUNT(*) FROM registered_host";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"registered_host"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
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
