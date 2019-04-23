package com.example.dxnima.zhidao.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.dxnima.zhidao.bean.table.Subject;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SUBJECT".
*/
public class SubjectDao extends AbstractDao<Subject, Void> {

    public static final String TABLENAME = "SUBJECT";

    /**
     * Properties of entity Subject.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Subid = new Property(0, int.class, "subid", false, "SUBID");
        public final static Property Subtitle = new Property(1, String.class, "subtitle", false, "SUBTITLE");
        public final static Property Userid = new Property(2, int.class, "userid", false, "USERID");
        public final static Property Code = new Property(3, String.class, "code", false, "CODE");
    };


    public SubjectDao(DaoConfig config) {
        super(config);
    }
    
    public SubjectDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SUBJECT\" (" + //
                "\"SUBID\" INTEGER NOT NULL ," + // 0: subid
                "\"SUBTITLE\" TEXT," + // 1: subtitle
                "\"USERID\" INTEGER NOT NULL ," + // 2: userid
                "\"CODE\" TEXT);"); // 3: code
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SUBJECT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Subject entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getSubid());
 
        String subtitle = entity.getSubtitle();
        if (subtitle != null) {
            stmt.bindString(2, subtitle);
        }
        stmt.bindLong(3, entity.getUserid());
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(4, code);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Subject entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getSubid());
 
        String subtitle = entity.getSubtitle();
        if (subtitle != null) {
            stmt.bindString(2, subtitle);
        }
        stmt.bindLong(3, entity.getUserid());
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(4, code);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public Subject readEntity(Cursor cursor, int offset) {
        Subject entity = new Subject( //
            cursor.getInt(offset + 0), // subid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // subtitle
            cursor.getInt(offset + 2), // userid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // code
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Subject entity, int offset) {
        entity.setSubid(cursor.getInt(offset + 0));
        entity.setSubtitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUserid(cursor.getInt(offset + 2));
        entity.setCode(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(Subject entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(Subject entity) {
        return null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}