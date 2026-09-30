package h6;

import V5.x;
import android.os.IBinder;
import android.os.IInterface;
import ao.ad;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import java.lang.reflect.Field;
import m6.AbstractBinderC2100a;

/* renamed from: h6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1814d extends AbstractBinderC2100a implements InterfaceC1812b {
    public final Object hotel;

    public BinderC1814d(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 1);
        this.hotel = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h6.b, com.google.android.gms.internal.measurement.y] */
    public static InterfaceC1812b lime(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof InterfaceC1812b) {
            return (InterfaceC1812b) queryLocalInterface;
        }
        return new AbstractC1394y(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    public static Object magenta(InterfaceC1812b interfaceC1812b) {
        if (interfaceC1812b instanceof BinderC1814d) {
            return ((BinderC1814d) interfaceC1812b).hotel;
        }
        IBinder asBinder = interfaceC1812b.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i4 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i4++;
                field = field2;
            }
        }
        if (i4 == 1) {
            x.hotel(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e4) {
                    throw new IllegalArgumentException("Binder object is null.", e4);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(ad.zulu(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
    }
}
