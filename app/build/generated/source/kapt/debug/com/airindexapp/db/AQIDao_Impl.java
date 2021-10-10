package com.airindexapp.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AQIDao_Impl implements AQIDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AQIndexTable> __insertionAdapterOfAQIndexTable;

  public AQIDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAQIndexTable = new EntityInsertionAdapter<AQIndexTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `aqi_table` (`id`,`city_name`,`aqi_value`,`timestamp`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AQIndexTable value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getCity_name() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCity_name());
        }
        if (value.getAqi_value() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAqi_value());
        }
        stmt.bindLong(4, value.getTimestamp());
      }
    };
  }

  @Override
  public Object insertRecord(final AQIndexTable record,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfAQIndexTable.insertAndReturnId(record);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertRecords(final List<AQIndexTable> record,
      final Continuation<? super List<Long>> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          List<Long> _result = __insertionAdapterOfAQIndexTable.insertAndReturnIdsList(record);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getDataByCity(final String cityName,
      final Continuation<? super List<AQIndexTable>> continuation) {
    final String _sql = "Select * FROM aqi_table where city_name=?  Limit 10";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (cityName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, cityName);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<AQIndexTable>>() {
      @Override
      public List<AQIndexTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "city_name");
          final int _cursorIndexOfAqiValue = CursorUtil.getColumnIndexOrThrow(_cursor, "aqi_value");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<AQIndexTable> _result = new ArrayList<AQIndexTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AQIndexTable _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpCity_name;
            if (_cursor.isNull(_cursorIndexOfCityName)) {
              _tmpCity_name = null;
            } else {
              _tmpCity_name = _cursor.getString(_cursorIndexOfCityName);
            }
            final String _tmpAqi_value;
            if (_cursor.isNull(_cursorIndexOfAqiValue)) {
              _tmpAqi_value = null;
            } else {
              _tmpAqi_value = _cursor.getString(_cursorIndexOfAqiValue);
            }
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            _item = new AQIndexTable(_tmpId,_tmpCity_name,_tmpAqi_value,_tmpTimestamp);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getlatestData(final Continuation<? super List<AQIndexTable>> continuation) {
    final String _sql = "SELECT city_name, aqi_value, Max(timestamp) as timestamp FROM aqi_table GROUP BY city_name ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<AQIndexTable>>() {
      @Override
      public List<AQIndexTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCityName = CursorUtil.getColumnIndexOrThrow(_cursor, "city_name");
          final int _cursorIndexOfAqiValue = CursorUtil.getColumnIndexOrThrow(_cursor, "aqi_value");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<AQIndexTable> _result = new ArrayList<AQIndexTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AQIndexTable _item;
            final String _tmpCity_name;
            if (_cursor.isNull(_cursorIndexOfCityName)) {
              _tmpCity_name = null;
            } else {
              _tmpCity_name = _cursor.getString(_cursorIndexOfCityName);
            }
            final String _tmpAqi_value;
            if (_cursor.isNull(_cursorIndexOfAqiValue)) {
              _tmpAqi_value = null;
            } else {
              _tmpAqi_value = _cursor.getString(_cursorIndexOfAqiValue);
            }
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            _item = new AQIndexTable(null,_tmpCity_name,_tmpAqi_value,_tmpTimestamp);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
