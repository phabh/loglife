package com.phabh.loglife.app.database;

import android.net.Uri;

import com.raizlabs.android.dbflow.annotation.Database;
import com.raizlabs.android.dbflow.annotation.provider.ContentProvider;

@ContentProvider(authority = LogLifeDatabase.AUTHORITY,
        database = LogLifeDatabase.class,
        baseContentUri = LogLifeDatabase.BASE_CONTENT_URI)
@Database(name=LogLifeDatabase.NAME, version = LogLifeDatabase.VERSION)
public class LogLifeDatabase {
    public static final String NAME = "OmniDatabase";
    public static final int VERSION = 1;
    public static final String AUTHORITY = "com.phabh.dbflow.provider";
    public static final String BASE_CONTENT_URI = "content://";

    public static Uri buildUri(String... paths) {
        Uri.Builder builder = Uri.parse(LogLifeDatabase.BASE_CONTENT_URI + LogLifeDatabase.AUTHORITY).buildUpon();
        for (String path : paths) {
            builder.appendPath(path);
        }
        return builder.build();
    }
}
