package com.google.gson.internal.sql;

import S8.c;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends ad {
    static final ae FACTORY = new ae() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.ae
        public <T> ad create(l lVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            lVar.getClass();
            return new SqlTimestampTypeAdapter(lVar.foxtrot(TypeToken.get(Date.class)));
        }
    };
    private final ad dateTypeAdapter;

    private SqlTimestampTypeAdapter(ad adVar) {
        this.dateTypeAdapter = adVar;
    }

    @Override // com.google.gson.ad
    public Timestamp read(S8.a aVar) throws IOException {
        Date date = (Date) this.dateTypeAdapter.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.ad
    public void write(c cVar, Timestamp timestamp) throws IOException {
        this.dateTypeAdapter.write(cVar, timestamp);
    }
}
