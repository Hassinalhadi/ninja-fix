package com.clevertap.android.sdk.db;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001c\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/clevertap/android/sdk/db/QueueData;", "", "table", "Lcom/clevertap/android/sdk/db/Table;", "<init>", "(Lcom/clevertap/android/sdk/db/Table;)V", "getTable", "()Lcom/clevertap/android/sdk/db/Table;", "setTable", Column.DATA, "Lorg/json/JSONArray;", "getData", "()Lorg/json/JSONArray;", "setData", "(Lorg/json/JSONArray;)V", "lastId", "", "getLastId", "()Ljava/lang/String;", "setLastId", "(Ljava/lang/String;)V", "isEmpty", "", "()Z", "setDataFromDbObject", "", "dbObject", "Lorg/json/JSONObject;", "toString", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QueueData {

    @Nullable
    private JSONArray data;

    @Nullable
    private String lastId;

    @NotNull
    private Table table;

    public QueueData(@NotNull Table table) {
        Intrinsics.echo(table, "table");
        this.table = table;
    }

    @Nullable
    public final JSONArray getData() {
        return this.data;
    }

    @Nullable
    public final String getLastId() {
        return this.lastId;
    }

    @NotNull
    public final Table getTable() {
        return this.table;
    }

    public final boolean isEmpty() {
        JSONArray jSONArray = this.data;
        if (this.lastId != null && jSONArray != null && jSONArray.length() > 0) {
            return false;
        }
        return true;
    }

    public final void setData(@Nullable JSONArray jSONArray) {
        this.data = jSONArray;
    }

    public final void setDataFromDbObject(@Nullable JSONObject dbObject) {
        if (dbObject != null) {
            Iterator<String> keys = dbObject.keys();
            if (keys.hasNext()) {
                String next = keys.next();
                this.lastId = next;
                try {
                    this.data = dbObject.getJSONArray(next);
                } catch (JSONException unused) {
                    this.lastId = null;
                    this.data = null;
                }
            }
        }
    }

    public final void setLastId(@Nullable String str) {
        this.lastId = str;
    }

    public final void setTable(@NotNull Table table) {
        Intrinsics.echo(table, "<set-?>");
        this.table = table;
    }

    @NotNull
    public String toString() {
        int i4;
        JSONArray jSONArray = this.data;
        if (jSONArray != null) {
            i4 = jSONArray.length();
        } else {
            i4 = 0;
        }
        if (isEmpty()) {
            return "table: " + this.table + " | numItems: " + i4;
        }
        return "table: " + this.table + " | lastId: " + this.lastId + " | numItems: " + i4 + " | items: " + this.data;
    }
}
