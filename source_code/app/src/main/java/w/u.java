package w;

import D0.am;
import I0.aa;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.ax;
import okhttp3.internal.http2.Http2;
import pf.C2361k;
import s1.C2576i;
import s1.af;
import t0.C0;
import v.AbstractC3164c;
import y.C3344D;

/* loaded from: classes3.dex */
public final class u {
    public final View alpha;
    public final o bravo;
    public ax echo;
    public C3344D foxtrot;
    public C0 golf;
    public Rect lima;
    public final r mike;
    public Function1 charlie = new C2361k(24);
    public Function1 delta = new C2361k(25);
    public aa hotel = new aa(4, am.bravo, "");
    public I0.l india = I0.l.golf;
    public final ArrayList juliet = new ArrayList();
    public final Object kilo = LazyKt.alpha(kotlin.i.purple, new kotlin.collections.n(25, this));

    public u(View view, C3224b c3224b, o oVar) {
        this.alpha = view;
        this.bravo = oVar;
        this.mike = new r(c3224b, oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v alpha(EditorInfo editorInfo) {
        int i4;
        int i5;
        int i10;
        int i11;
        int collectionSizeOrDefault;
        aa aaVar = this.hotel;
        String str = aaVar.alpha.purple;
        I0.l lVar = this.india;
        int i12 = lVar.echo;
        boolean z2 = lVar.alpha;
        if (i12 == 1) {
            if (!z2) {
                i4 = 0;
                editorInfo.imeOptions = i4;
                if (Build.VERSION.SDK_INT >= 24) {
                    K0.b bVar = K0.b.red;
                    K0.b bVar2 = lVar.foxtrot;
                    if (Intrinsics.areEqual(bVar2, bVar)) {
                        editorInfo.hintLocales = null;
                    } else {
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bVar2, 10);
                        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                        Iterator it = bVar2.alpha.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((K0.a) it.next()).alpha);
                        }
                        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                        editorInfo.hintLocales = af.echo((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
                    }
                }
                i5 = lVar.delta;
                if (i5 != 1) {
                    if (i5 == 2) {
                        editorInfo.imeOptions |= RecyclerView.UNDEFINED_DURATION;
                    } else {
                        if (i5 == 3) {
                            i10 = 2;
                        } else if (i5 == 4) {
                            i10 = 3;
                        } else if (i5 == 5) {
                            i10 = 17;
                        } else if (i5 == 6) {
                            i10 = 33;
                        } else if (i5 == 7) {
                            i10 = 129;
                        } else if (i5 == 8) {
                            i10 = 18;
                        } else if (i5 == 9) {
                            i10 = 8194;
                        } else {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        editorInfo.inputType = i10;
                        if (!z2 && (i10 & 1) == 1) {
                            editorInfo.inputType = 131072 | i10;
                            if (lVar.echo == 1) {
                                editorInfo.imeOptions |= 1073741824;
                            }
                        }
                        i11 = editorInfo.inputType;
                        if ((i11 & 1) == 1) {
                            int i13 = lVar.bravo;
                            if (i13 == 1) {
                                editorInfo.inputType = i11 | 4096;
                            } else if (i13 == 2) {
                                editorInfo.inputType = i11 | 8192;
                            } else if (i13 == 3) {
                                editorInfo.inputType = i11 | Http2.INITIAL_MAX_FRAME_SIZE;
                            }
                            if (lVar.charlie) {
                                editorInfo.inputType |= 32768;
                            }
                        }
                        int i14 = am.charlie;
                        long j5 = aaVar.bravo;
                        editorInfo.initialSelStart = (int) (j5 >> 32);
                        editorInfo.initialSelEnd = (int) (4294967295L & j5);
                        u1.c.alpha(editorInfo, str);
                        editorInfo.imeOptions |= 33554432;
                        if (!AbstractC3164c.alpha && i5 != 7 && i5 != 8) {
                            u1.c.bravo(editorInfo, true);
                            editorInfo.setSupportedHandwritingGestures(CollectionsKt.listOf(i2.c.mike(), i2.c.amber(), i2.c.yankee(), i2.c.zulu(), i2.c.azure(), i2.c.beige(), i2.c.black()));
                            editorInfo.setSupportedHandwritingGesturePreviews(ArraysKt.g(new Class[]{i2.c.mike(), i2.c.amber(), i2.c.yankee(), i2.c.zulu()}));
                        } else {
                            u1.c.bravo(editorInfo, false);
                        }
                        s sVar = t.alpha;
                        if (K1.k.delta()) {
                            K1.k.alpha().india(editorInfo);
                        }
                        v vVar = new v(this.hotel, new C2576i(this), this.india.charlie, this.echo, this.foxtrot, this.golf);
                        this.juliet.add(new WeakReference(vVar));
                        return vVar;
                    }
                }
                i10 = 1;
                editorInfo.inputType = i10;
                if (!z2) {
                    editorInfo.inputType = 131072 | i10;
                    if (lVar.echo == 1) {
                    }
                }
                i11 = editorInfo.inputType;
                if ((i11 & 1) == 1) {
                }
                int i142 = am.charlie;
                long j52 = aaVar.bravo;
                editorInfo.initialSelStart = (int) (j52 >> 32);
                editorInfo.initialSelEnd = (int) (4294967295L & j52);
                u1.c.alpha(editorInfo, str);
                editorInfo.imeOptions |= 33554432;
                if (!AbstractC3164c.alpha) {
                }
                u1.c.bravo(editorInfo, false);
                s sVar2 = t.alpha;
                if (K1.k.delta()) {
                }
                v vVar2 = new v(this.hotel, new C2576i(this), this.india.charlie, this.echo, this.foxtrot, this.golf);
                this.juliet.add(new WeakReference(vVar2));
                return vVar2;
            }
            i4 = 6;
            editorInfo.imeOptions = i4;
            if (Build.VERSION.SDK_INT >= 24) {
            }
            i5 = lVar.delta;
            if (i5 != 1) {
            }
            i10 = 1;
            editorInfo.inputType = i10;
            if (!z2) {
            }
            i11 = editorInfo.inputType;
            if ((i11 & 1) == 1) {
            }
            int i1422 = am.charlie;
            long j522 = aaVar.bravo;
            editorInfo.initialSelStart = (int) (j522 >> 32);
            editorInfo.initialSelEnd = (int) (4294967295L & j522);
            u1.c.alpha(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (!AbstractC3164c.alpha) {
            }
            u1.c.bravo(editorInfo, false);
            s sVar22 = t.alpha;
            if (K1.k.delta()) {
            }
            v vVar22 = new v(this.hotel, new C2576i(this), this.india.charlie, this.echo, this.foxtrot, this.golf);
            this.juliet.add(new WeakReference(vVar22));
            return vVar22;
        }
        if (i12 == 0) {
            i4 = 1;
        } else if (i12 == 2) {
            i4 = 2;
        } else if (i12 == 6) {
            i4 = 5;
        } else if (i12 == 5) {
            i4 = 7;
        } else if (i12 == 3) {
            i4 = 3;
        } else if (i12 == 4) {
            i4 = 4;
        } else {
            if (i12 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
            i4 = 6;
        }
        editorInfo.imeOptions = i4;
        if (Build.VERSION.SDK_INT >= 24) {
        }
        i5 = lVar.delta;
        if (i5 != 1) {
        }
        i10 = 1;
        editorInfo.inputType = i10;
        if (!z2) {
        }
        i11 = editorInfo.inputType;
        if ((i11 & 1) == 1) {
        }
        int i14222 = am.charlie;
        long j5222 = aaVar.bravo;
        editorInfo.initialSelStart = (int) (j5222 >> 32);
        editorInfo.initialSelEnd = (int) (4294967295L & j5222);
        u1.c.alpha(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC3164c.alpha) {
        }
        u1.c.bravo(editorInfo, false);
        s sVar222 = t.alpha;
        if (K1.k.delta()) {
        }
        v vVar222 = new v(this.hotel, new C2576i(this), this.india.charlie, this.echo, this.foxtrot, this.golf);
        this.juliet.add(new WeakReference(vVar222));
        return vVar222;
    }
}
