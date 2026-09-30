package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.ad;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class h extends i {
    public final /* synthetic */ boolean delta;
    public final /* synthetic */ Method echo;
    public final /* synthetic */ ad foxtrot;
    public final /* synthetic */ ad golf;
    public final /* synthetic */ boolean hotel;
    public final /* synthetic */ boolean india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Field field, boolean z2, Method method, ad adVar, ad adVar2, boolean z10, boolean z11) {
        super(str, field);
        this.delta = z2;
        this.echo = method;
        this.foxtrot = adVar;
        this.golf = adVar2;
        this.hotel = z10;
        this.india = z11;
    }

    @Override // com.google.gson.internal.bind.i
    public final void alpha(S8.c cVar, Object obj) {
        Object obj2;
        Field field = this.bravo;
        boolean z2 = this.delta;
        Method method = this.echo;
        if (z2) {
            if (method == null) {
                ReflectiveTypeAdapterFactory.checkAccessible(obj, field);
            } else {
                ReflectiveTypeAdapterFactory.checkAccessible(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new JsonIOException(ao.ad.gray("Accessor ", R8.c.delta(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        cVar.quebec(this.alpha);
        this.foxtrot.write(cVar, obj2);
    }
}
