package com.google.gson.internal.sql;

import S8.c;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends ad {
    static final ae FACTORY = new ae() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.ae
        public <T> ad create(l lVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Time.class) {
                return null;
            }
            return new SqlTimeTypeAdapter();
        }
    };
    private final DateFormat format;

    private SqlTimeTypeAdapter() {
        this.format = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.ad
    public Time read(S8.a aVar) throws IOException {
        Time time;
        if (aVar.white() == S8.b.f2049b) {
            aVar.peach();
            return null;
        }
        String purple = aVar.purple();
        synchronized (this) {
            TimeZone timeZone = this.format.getTimeZone();
            try {
                try {
                    time = new Time(this.format.parse(purple).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + purple + "' as SQL Time; at path " + aVar.beige(), e);
                }
            } finally {
                this.format.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.ad
    public void write(c cVar, Time time) throws IOException {
        String format;
        if (time == null) {
            cVar.azure();
            return;
        }
        synchronized (this) {
            format = this.format.format((Date) time);
        }
        cVar.navy(format);
    }
}
