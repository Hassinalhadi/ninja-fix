package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes2.dex */
public final class aq implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        if (set.isEmpty()) {
            if (type == Boolean.TYPE) {
                return at.bravo;
            }
            if (type == Byte.TYPE) {
                return at.charlie;
            }
            if (type == Character.TYPE) {
                return at.delta;
            }
            if (type == Double.TYPE) {
                return at.echo;
            }
            if (type == Float.TYPE) {
                return at.foxtrot;
            }
            if (type == Integer.TYPE) {
                return at.golf;
            }
            if (type == Long.TYPE) {
                return at.hotel;
            }
            if (type == Short.TYPE) {
                return at.india;
            }
            if (type == Boolean.class) {
                return at.bravo.nullSafe();
            }
            if (type == Byte.class) {
                return at.charlie.nullSafe();
            }
            if (type == Character.class) {
                return at.delta.nullSafe();
            }
            if (type == Double.class) {
                return at.echo.nullSafe();
            }
            if (type == Float.class) {
                return at.foxtrot.nullSafe();
            }
            if (type == Integer.class) {
                return at.golf.nullSafe();
            }
            if (type == Long.class) {
                return at.hotel.nullSafe();
            }
            if (type == Short.class) {
                return at.india.nullSafe();
            }
            if (type == String.class) {
                return at.juliet.nullSafe();
            }
            if (type == Object.class) {
                return new as(moshi).nullSafe();
            }
            Class<?> rawType = Types.getRawType(type);
            JsonAdapter<?> generatedAdapter = Util.generatedAdapter(moshi, type, rawType);
            if (generatedAdapter != null) {
                return generatedAdapter;
            }
            if (rawType.isEnum()) {
                return new ar(rawType).nullSafe();
            }
            return null;
        }
        return null;
    }
}
