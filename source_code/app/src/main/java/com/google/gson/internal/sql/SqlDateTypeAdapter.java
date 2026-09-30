package com.google.gson.internal.sql;

import S8.c;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes2.dex */
final class SqlDateTypeAdapter extends ad {
    static final ae FACTORY = new ae() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.ae
        public <T> ad create(l lVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Date.class) {
                return null;
            }
            return new SqlDateTypeAdapter();
        }
    };
    private final DateFormat format;

    private SqlDateTypeAdapter() {
        this.format = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.ad
    public Date read(S8.a aVar) throws IOException {
        Date date;
        if (aVar.white() == S8.b.f2049b) {
            aVar.peach();
            return null;
        }
        String purple = aVar.purple();
        synchronized (this) {
            TimeZone timeZone = this.format.getTimeZone();
            try {
                try {
                    date = new Date(this.format.parse(purple).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + purple + "' as SQL Date; at path " + aVar.beige(), e);
                }
            } finally {
                this.format.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.ad
    public void write(c cVar, Date date) throws IOException {
        String format;
        if (date == null) {
            cVar.azure();
            return;
        }
        synchronized (this) {
            format = this.format.format((java.util.Date) date);
        }
        cVar.navy(format);
    }
}
