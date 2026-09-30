package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class U0 extends ContentObserver {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U0(int i4, Object obj) {
        super(null);
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.alpha) {
            case 3:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.alpha) {
            case 2:
                ((xf.e) this.bravo).mike(Unit.INSTANCE);
                return;
            default:
                super.onChange(z2, uri);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(xf.e eVar, Handler handler) {
        super(handler);
        this.alpha = 2;
        this.bravo = eVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2) {
        Cursor cursor;
        switch (this.alpha) {
            case 0:
                ((AtomicBoolean) ((U7.c) this.bravo).alpha).set(true);
                return;
            case 1:
                X0 x02 = (X0) this.bravo;
                synchronized (x02.echo) {
                    x02.foxtrot = null;
                    x02.charlie.run();
                }
                synchronized (x02) {
                    try {
                        Iterator it = x02.golf.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
            default:
                super.onChange(z2);
                return;
            case 3:
                androidx.appcompat.widget.R0 r02 = (androidx.appcompat.widget.R0) this.bravo;
                if (!r02.purple || (cursor = r02.red) == null || cursor.isClosed()) {
                    return;
                }
                r02.alpha = r02.red.requery();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(androidx.appcompat.widget.R0 r02) {
        super(new Handler());
        this.alpha = 3;
        this.bravo = r02;
    }
}
