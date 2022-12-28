package com.metallic.chiaki.common;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile RegisteredHostDao _registeredHostDao;

  private volatile ManualHostDao _manualHostDao;

  private volatile ImportDao _importDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `registered_host` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `target` INTEGER NOT NULL, `ap_ssid` TEXT, `ap_bssid` TEXT, `ap_key` TEXT, `ap_name` TEXT, `server_mac` INTEGER NOT NULL, `server_nickname` TEXT, `rp_regist_key` BLOB NOT NULL, `rp_key_type` INTEGER NOT NULL, `rp_key` BLOB NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `manual_host` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `host` TEXT NOT NULL, `registered_host` INTEGER, FOREIGN KEY(`registered_host`) REFERENCES `registered_host`(`id`) ON UPDATE NO ACTION ON DELETE SET NULL )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2fea63b7499fa89872d89cb9f5306ba2')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `registered_host`");
        _db.execSQL("DROP TABLE IF EXISTS `manual_host`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRegisteredHost = new HashMap<String, TableInfo.Column>(11);
        _columnsRegisteredHost.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegisteredHost.put("target", new TableInfo.Column("target", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegisteredHost.put("ap_ssid", new TableInfo.Column("ap_ssid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegisteredHost.put("ap_bssid", new TableInfo.Column("ap_bssid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegisteredHost.put("ap_key", new TableInfo.Column("ap_key", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegisteredHost.put("ap_name", new TableInfo.Column("ap_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegisteredHost.put("server_mac", new TableInfo.Column("server_mac", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegisteredHost.put("server_nickname", new TableInfo.Column("server_nickname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegisteredHost.put("rp_regist_key", new TableInfo.Column("rp_regist_key", "BLOB", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegisteredHost.put("rp_key_type", new TableInfo.Column("rp_key_type", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegisteredHost.put("rp_key", new TableInfo.Column("rp_key", "BLOB", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRegisteredHost = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRegisteredHost = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRegisteredHost = new TableInfo("registered_host", _columnsRegisteredHost, _foreignKeysRegisteredHost, _indicesRegisteredHost);
        final TableInfo _existingRegisteredHost = TableInfo.read(_db, "registered_host");
        if (! _infoRegisteredHost.equals(_existingRegisteredHost)) {
          return new RoomOpenHelper.ValidationResult(false, "registered_host(com.metallic.chiaki.common.RegisteredHost).\n"
                  + " Expected:\n" + _infoRegisteredHost + "\n"
                  + " Found:\n" + _existingRegisteredHost);
        }
        final HashMap<String, TableInfo.Column> _columnsManualHost = new HashMap<String, TableInfo.Column>(3);
        _columnsManualHost.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsManualHost.put("host", new TableInfo.Column("host", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsManualHost.put("registered_host", new TableInfo.Column("registered_host", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysManualHost = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysManualHost.add(new TableInfo.ForeignKey("registered_host", "SET NULL", "NO ACTION",Arrays.asList("registered_host"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesManualHost = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoManualHost = new TableInfo("manual_host", _columnsManualHost, _foreignKeysManualHost, _indicesManualHost);
        final TableInfo _existingManualHost = TableInfo.read(_db, "manual_host");
        if (! _infoManualHost.equals(_existingManualHost)) {
          return new RoomOpenHelper.ValidationResult(false, "manual_host(com.metallic.chiaki.common.ManualHost).\n"
                  + " Expected:\n" + _infoManualHost + "\n"
                  + " Found:\n" + _existingManualHost);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2fea63b7499fa89872d89cb9f5306ba2", "72424a318750ec1a48040c1cd1e92f45");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "registered_host","manual_host");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `registered_host`");
      _db.execSQL("DELETE FROM `manual_host`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public RegisteredHostDao registeredHostDao() {
    if (_registeredHostDao != null) {
      return _registeredHostDao;
    } else {
      synchronized(this) {
        if(_registeredHostDao == null) {
          _registeredHostDao = new RegisteredHostDao_Impl(this);
        }
        return _registeredHostDao;
      }
    }
  }

  @Override
  public ManualHostDao manualHostDao() {
    if (_manualHostDao != null) {
      return _manualHostDao;
    } else {
      synchronized(this) {
        if(_manualHostDao == null) {
          _manualHostDao = new ManualHostDao_Impl(this);
        }
        return _manualHostDao;
      }
    }
  }

  @Override
  public ImportDao importDao() {
    if (_importDao != null) {
      return _importDao;
    } else {
      synchronized(this) {
        if(_importDao == null) {
          _importDao = new ImportDao_Impl(this);
        }
        return _importDao;
      }
    }
  }
}
