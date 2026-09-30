package l2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends Binder implements i {
    public final /* synthetic */ MultiInstanceInvalidationService golf;

    public m(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.golf = multiInstanceInvalidationService;
        attachInterface(this, i.foxtrot);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void bravo(int i4, String[] tables) {
        Intrinsics.echo(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.golf;
        synchronized (multiInstanceInvalidationService.red) {
            String str = (String) multiInstanceInvalidationService.purple.get(Integer.valueOf(i4));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.red.beginBroadcast();
            for (int i5 = 0; i5 < beginBroadcast; i5++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.red.getBroadcastCookie(i5);
                    Intrinsics.charlie(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.purple.get(num);
                    if (i4 != intValue && Intrinsics.areEqual(str, str2)) {
                        try {
                            ((h) multiInstanceInvalidationService.red.getBroadcastItem(i5)).india(tables);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.red.finishBroadcast();
                }
            }
        }
    }

    public final int charlie(h callback, String str) {
        Intrinsics.echo(callback, "callback");
        int i4 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.golf;
        synchronized (multiInstanceInvalidationService.red) {
            try {
                int i5 = multiInstanceInvalidationService.alpha + 1;
                multiInstanceInvalidationService.alpha = i5;
                if (multiInstanceInvalidationService.red.register(callback, Integer.valueOf(i5))) {
                    multiInstanceInvalidationService.purple.put(Integer.valueOf(i5), str);
                    i4 = i5;
                } else {
                    multiInstanceInvalidationService.alpha--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l2.g] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, l2.g] */
    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        String str = i.foxtrot;
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        h hVar = null;
        h callback = null;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                bravo(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(h.echo);
                if (queryLocalInterface != null && (queryLocalInterface instanceof h)) {
                    callback = (h) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.golf = readStrongBinder;
                    callback = obj;
                }
            }
            int readInt = parcel.readInt();
            Intrinsics.echo(callback, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.golf;
            synchronized (multiInstanceInvalidationService.red) {
                multiInstanceInvalidationService.red.unregister(callback);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(h.echo);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof h)) {
                hVar = (h) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.golf = readStrongBinder2;
                hVar = obj2;
            }
        }
        int charlie = charlie(hVar, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(charlie);
        return true;
    }
}
