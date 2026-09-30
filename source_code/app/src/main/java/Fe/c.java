package Fe;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import coil.memory.MemoryCache$Key;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class c implements Q3.a, t1.n {
    public final /* synthetic */ int alpha;
    public int purple;
    public Object red;

    public /* synthetic */ c(int i4, Serializable serializable, int i5) {
        this.alpha = i5;
        this.purple = i4;
        this.red = serializable;
    }

    @Override // Q3.a
    public com.bumptech.glide.load.engine.w alpha(com.bumptech.glide.load.engine.w wVar, E3.i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) wVar.get()).compress((Bitmap.CompressFormat) this.red, this.purple, byteArrayOutputStream);
        wVar.bravo();
        return new M3.c(byteArrayOutputStream.toByteArray());
    }

    public void bravo(long j5) {
        if (!echo(j5)) {
            int i4 = this.purple;
            long[] jArr = (long[]) this.red;
            if (i4 >= jArr.length) {
                jArr = Arrays.copyOf(jArr, Math.max(i4 + 1, jArr.length * 2));
                Intrinsics.delta(jArr, "copyOf(...)");
                this.red = jArr;
            }
            jArr[i4] = j5;
            if (i4 >= this.purple) {
                this.purple = i4 + 1;
            }
        }
    }

    @Override // t1.n
    public boolean charlie(View view) {
        ((BottomSheetBehavior) this.red).sierra(this.purple);
        return true;
    }

    public void delta() {
        Bitmap bitmap;
        WeakReference weakReference;
        this.purple = 0;
        Iterator it = ((LinkedHashMap) this.red).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                V2.e eVar = (V2.e) CollectionsKt.green(arrayList);
                if (eVar != null && (weakReference = eVar.bravo) != null) {
                    bitmap = (Bitmap) weakReference.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    int i10 = i5 - i4;
                    if (((V2.e) arrayList.get(i10)).bravo.get() == null) {
                        arrayList.remove(i10);
                        i4++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public boolean echo(long j5) {
        int i4 = this.purple;
        for (int i5 = 0; i5 < i4; i5++) {
            if (((long[]) this.red)[i5] == j5) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public androidx.appcompat.app.g foxtrot() {
        int i4;
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.red;
        androidx.appcompat.app.g gVar = new androidx.appcompat.app.g(dVar.alpha, this.purple);
        View view = dVar.echo;
        androidx.appcompat.app.f fVar = gVar.alpha;
        if (view != null) {
            fVar.whiskey = view;
        } else {
            CharSequence charSequence = dVar.delta;
            if (charSequence != null) {
                fVar.delta = charSequence;
                TextView textView = fVar.uniform;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = dVar.charlie;
            if (drawable != null) {
                fVar.sierra = drawable;
                ImageView imageView = fVar.tango;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.tango.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = dVar.foxtrot;
        if (charSequence2 != null) {
            fVar.echo = charSequence2;
            TextView textView2 = fVar.victor;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = dVar.golf;
        if (charSequence3 != null) {
            fVar.charlie(-1, charSequence3, dVar.hotel);
        }
        CharSequence charSequence4 = dVar.india;
        if (charSequence4 != null) {
            fVar.charlie(-2, charSequence4, dVar.juliet);
        }
        String str = dVar.kilo;
        if (str != null) {
            fVar.charlie(-3, str, dVar.lima);
        }
        if (dVar.papa != null || dVar.quebec != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) dVar.bravo.inflate(fVar.amber, (ViewGroup) null);
            if (dVar.tango) {
                i4 = fVar.azure;
            } else {
                i4 = fVar.beige;
            }
            Object obj = dVar.quebec;
            ?? r82 = obj;
            if (obj == null) {
                r82 = new ArrayAdapter(dVar.alpha, i4, R.id.text1, dVar.papa);
            }
            fVar.xray = r82;
            fVar.yankee = dVar.uniform;
            if (dVar.romeo != null) {
                alertController$RecycleListView.setOnItemClickListener(new androidx.appcompat.app.c(dVar, fVar));
            }
            if (dVar.tango) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.foxtrot = alertController$RecycleListView;
        }
        View view2 = dVar.sierra;
        if (view2 != null) {
            fVar.golf = view2;
            fVar.hotel = false;
        }
        gVar.setCancelable(dVar.mike);
        if (dVar.mike) {
            gVar.setCanceledOnTouchOutside(true);
        }
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(dVar.november);
        DialogInterface.OnKeyListener onKeyListener = dVar.oscar;
        if (onKeyListener != null) {
            gVar.setOnKeyListener(onKeyListener);
        }
        return gVar;
    }

    public void golf(int i4, int i5) {
        int i10 = i5 + i4;
        char[] cArr = (char[]) this.red;
        if (cArr.length <= i10) {
            int i11 = i4 * 2;
            if (i10 < i11) {
                i10 = i11;
            }
            char[] copyOf = Arrays.copyOf(cArr, i10);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.red = copyOf;
        }
    }

    public synchronized List hotel() {
        return Collections.unmodifiableList(new ArrayList((ArrayList) this.red));
    }

    public void india() {
        Pf.f fVar = Pf.f.red;
        char[] array = (char[]) this.red;
        fVar.getClass();
        Intrinsics.echo(array, "array");
        synchronized (fVar) {
            int i4 = fVar.alpha;
            if (array.length + i4 < Pf.d.alpha) {
                fVar.alpha = i4 + array.length;
                ((kotlin.collections.l) fVar.purple).addLast(array);
            }
        }
    }

    public void juliet(long j5) {
        int i4 = this.purple;
        int i5 = 0;
        while (i5 < i4) {
            if (j5 == ((long[]) this.red)[i5]) {
                int i10 = this.purple - 1;
                while (i5 < i10) {
                    long[] jArr = (long[]) this.red;
                    int i11 = i5 + 1;
                    jArr[i5] = jArr[i11];
                    i5 = i11;
                }
                this.purple--;
                return;
            }
            i5++;
        }
    }

    public synchronized void kilo(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map, int i4) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.red;
            Object obj = linkedHashMap.get(memoryCache$Key);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(memoryCache$Key, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            V2.e eVar = new V2.e(identityHashCode, new WeakReference(bitmap), map, i4);
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    V2.e eVar2 = (V2.e) arrayList.get(i5);
                    if (i4 >= eVar2.delta) {
                        if (eVar2.alpha == identityHashCode && eVar2.bravo.get() == bitmap) {
                            arrayList.set(i5, eVar);
                        } else {
                            arrayList.add(i5, eVar);
                        }
                    } else {
                        i5++;
                    }
                } else {
                    arrayList.add(eVar);
                    break;
                }
            }
            int i10 = this.purple;
            this.purple = i10 + 1;
            if (i10 >= 10) {
                delta();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public c lima(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.red;
        dVar.india = charSequence;
        dVar.juliet = onClickListener;
        return this;
    }

    public c mike(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.red;
        dVar.golf = charSequence;
        dVar.hotel = onClickListener;
        return this;
    }

    public androidx.appcompat.app.g november() {
        androidx.appcompat.app.g foxtrot = foxtrot();
        foxtrot.show();
        return foxtrot;
    }

    public synchronized void oscar(int i4) {
        if (i4 >= 10 && i4 != 20) {
            delta();
        }
    }

    public synchronized boolean papa(List list) {
        ((ArrayList) this.red).clear();
        if (list.size() > this.purple) {
            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.purple, null);
            return ((ArrayList) this.red).addAll(list.subList(0, this.purple));
        }
        return ((ArrayList) this.red).addAll(list);
    }

    public void quebec(String text) {
        Intrinsics.echo(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        golf(this.purple, length);
        text.getChars(0, text.length(), (char[]) this.red, this.purple);
        this.purple += length;
    }

    public String toString() {
        switch (this.alpha) {
            case 2:
                return new String((char[]) this.red, 0, this.purple);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(int i4, boolean z2) {
        this.alpha = i4;
    }

    public /* synthetic */ c(Object obj, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.purple = i4;
    }

    public c(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 5:
                this.red = new ArrayList();
                this.purple = 128;
                return;
            case 6:
            default:
                this.red = Bitmap.CompressFormat.JPEG;
                this.purple = 100;
                return;
            case 7:
                this.red = new LinkedHashMap();
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, androidx.appcompat.app.g.bravo(0, context));
        this.alpha = 9;
    }

    public c(Context context, int i4) {
        this.alpha = 9;
        this.red = new androidx.appcompat.app.d(new ContextThemeWrapper(context, androidx.appcompat.app.g.bravo(i4, context)));
        this.purple = i4;
    }
}
