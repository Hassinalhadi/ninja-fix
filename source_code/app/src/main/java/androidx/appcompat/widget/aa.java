package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s6.T7;

/* loaded from: classes3.dex */
public final class aa {
    public final EditText alpha;
    public final Aa.m bravo;

    public aa(EditText editText) {
        this.alpha = editText;
        this.bravo = new Aa.m(editText);
    }

    public final KeyListener alpha(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((J2.c) this.bravo.purple).getClass();
            if (keyListener instanceof L1.e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new L1.e(keyListener);
        }
        return keyListener;
    }

    public final void bravo(AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.alpha.getContext().obtainStyledAttributes(attributeSet, aj.a.india, i4, 0);
        try {
            boolean z2 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z2 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            delta(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final L1.b charlie(InputConnection inputConnection, EditorInfo editorInfo) {
        Aa.m mVar = this.bravo;
        if (inputConnection == null) {
            mVar.getClass();
            inputConnection = null;
        } else {
            J2.c cVar = (J2.c) mVar.purple;
            cVar.getClass();
            if (!(inputConnection instanceof L1.b)) {
                inputConnection = new L1.b((EditText) cVar.purple, inputConnection, editorInfo);
            }
        }
        return (L1.b) inputConnection;
    }

    public final void delta(boolean z2) {
        L1.i iVar = (L1.i) ((J2.c) this.bravo.purple).red;
        if (iVar.red != z2) {
            if (iVar.purple != null) {
                K1.k alpha = K1.k.alpha();
                L1.h hVar = iVar.purple;
                alpha.getClass();
                T7.foxtrot(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = alpha.alpha;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    alpha.bravo.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.red = z2;
            if (z2) {
                L1.i.alpha(iVar.alpha, K1.k.alpha().charlie());
            }
        }
    }
}
