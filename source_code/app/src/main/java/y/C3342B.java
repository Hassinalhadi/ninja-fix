package y;

import a0.C0366t;
import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import g.C1718a;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Settings;
import s6.C5;
import t0.C2896N;
import t0.C2916h;
import t0.InterfaceC2897O;

/* renamed from: y.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3342B extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C3344D purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3342B(C3344D c3344d, Nd.c cVar) {
        super(2, cVar);
        this.purple = c3344d;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3342B(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3342B) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0042, code lost:
    
        if (r8 == r4) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x029e, code lost:
    
        if (r0 == r4) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02a0, code lost:
    
        return r4;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        CharSequence text;
        int i4;
        int i5;
        int i10;
        int i11;
        int i12 = 0;
        byte b2 = 1;
        Od.a aVar = Od.a.alpha;
        int i13 = this.alpha;
        C3344D c3344d = this.purple;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    ResultKt.alpha(obj);
                    obj3 = obj;
                    D0.g gVar = (D0.g) obj3;
                    if (gVar != null) {
                        D0.d dVar = new D0.d(C5.hotel(c3344d.oscar(), c3344d.oscar().alpha.purple.length()));
                        dVar.alpha(gVar);
                        D0.g foxtrot = dVar.foxtrot();
                        D0.g golf = C5.golf(c3344d.oscar(), c3344d.oscar().alpha.purple.length());
                        D0.d dVar2 = new D0.d(foxtrot);
                        dVar2.alpha(golf);
                        D0.g foxtrot2 = dVar2.foxtrot();
                        int length = gVar.purple.length() + D0.am.foxtrot(c3344d.oscar().bravo);
                        I0.aa golf2 = C3344D.golf(foxtrot2, D0.ae.bravo(length, length));
                        c3344d.charlie.invoke(golf2);
                        c3344d.whiskey = new D0.am(golf2.bravo);
                        c3344d.romeo(n.am.alpha);
                        c3344d.alpha.echo = true;
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
            obj2 = obj;
        } else {
            ResultKt.alpha(obj);
            InterfaceC2897O interfaceC2897O = c3344d.hotel;
            if (interfaceC2897O != null) {
                this.alpha = 1;
                ClipData primaryClip = ((C2916h) interfaceC2897O).alpha.alpha.getPrimaryClip();
                if (primaryClip != null) {
                    obj2 = new C2896N(primaryClip);
                } else {
                    obj2 = null;
                }
            }
            return Unit.INSTANCE;
        }
        C2896N c2896n = (C2896N) obj2;
        if (c2896n != null) {
            this.alpha = 2;
            ClipData.Item itemAt = c2896n.alpha.getItemAt(0);
            if (itemAt != null && (text = itemAt.getText()) != null) {
                if (!(text instanceof Spanned)) {
                    obj3 = new D0.g(text.toString());
                } else {
                    Spanned spanned = (Spanned) text;
                    Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                    ArrayList arrayList = new ArrayList();
                    Intrinsics.echo(annotationArr, "<this>");
                    int length2 = annotationArr.length - 1;
                    if (length2 >= 0) {
                        int i14 = 0;
                        while (true) {
                            Annotation annotation = annotationArr[i14];
                            int i15 = i12;
                            if (Intrinsics.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                int spanStart = spanned.getSpanStart(annotation);
                                int spanEnd = spanned.getSpanEnd(annotation);
                                C1718a c1718a = new C1718a(annotation.getValue());
                                long j5 = C0366t.kilo;
                                long j6 = j5;
                                long j7 = Q0.p.charlie;
                                long j10 = j7;
                                H0.v vVar = null;
                                H0.r rVar = null;
                                H0.s sVar = null;
                                String str = null;
                                O0.a aVar2 = null;
                                O0.p pVar = null;
                                O0.l lVar = null;
                                a0.ar arVar = null;
                                while (true) {
                                    Parcel parcel = (Parcel) c1718a.purple;
                                    if (parcel.dataAvail() <= b2) {
                                        break;
                                    }
                                    byte readByte = parcel.readByte();
                                    if (readByte == b2) {
                                        if (parcel.dataAvail() < 8) {
                                            break;
                                        }
                                        j5 = c1718a.tango();
                                    } else if (readByte == 2) {
                                        if (parcel.dataAvail() < 5) {
                                            break;
                                        }
                                        j7 = c1718a.uniform();
                                        b2 = 1;
                                    } else if (readByte == 3) {
                                        if (parcel.dataAvail() < 4) {
                                            break;
                                        }
                                        vVar = new H0.v(parcel.readInt());
                                        b2 = 1;
                                    } else if (readByte == 4) {
                                        b2 = 1;
                                        if (parcel.dataAvail() < 1) {
                                            break;
                                        }
                                        byte readByte2 = parcel.readByte();
                                        if (readByte2 == 0 || readByte2 != 1) {
                                            i4 = i15;
                                        } else {
                                            i4 = 1;
                                        }
                                        rVar = new H0.r(i4);
                                    } else if (readByte == 5) {
                                        if (parcel.dataAvail() < 1) {
                                            break;
                                        }
                                        byte readByte3 = parcel.readByte();
                                        if (readByte3 != 0) {
                                            if (readByte3 == 1) {
                                                i11 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                            } else if (readByte3 == 3) {
                                                i11 = 2;
                                            } else if (readByte3 == 2) {
                                                i11 = 1;
                                            }
                                            sVar = new H0.s(i11);
                                            b2 = 1;
                                        }
                                        i11 = i15;
                                        sVar = new H0.s(i11);
                                        b2 = 1;
                                    } else {
                                        if (readByte == 6) {
                                            str = parcel.readString();
                                        } else if (readByte == 7) {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            }
                                            j10 = c1718a.uniform();
                                        } else if (readByte == 8) {
                                            if (parcel.dataAvail() < 4) {
                                                break;
                                            }
                                            aVar2 = new O0.a(parcel.readFloat());
                                        } else if (readByte == 9) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            }
                                            pVar = new O0.p(parcel.readFloat(), parcel.readFloat());
                                        } else if (readByte == 10) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            }
                                            j6 = c1718a.tango();
                                        } else if (readByte == 11) {
                                            if (parcel.dataAvail() < 4) {
                                                break;
                                            }
                                            int readInt = parcel.readInt();
                                            if ((readInt & 2) != 0) {
                                                i5 = 1;
                                            } else {
                                                i5 = i15;
                                            }
                                            if ((readInt & 1) != 0) {
                                                i10 = 1;
                                            } else {
                                                i10 = i15;
                                            }
                                            O0.l lVar2 = O0.l.delta;
                                            O0.l lVar3 = O0.l.charlie;
                                            if (i5 != 0 && i10 != 0) {
                                                O0.l[] lVarArr = new O0.l[2];
                                                lVarArr[i15] = lVar2;
                                                lVarArr[1] = lVar3;
                                                List listOf = CollectionsKt.listOf(lVarArr);
                                                Integer valueOf = Integer.valueOf(i15);
                                                int size = listOf.size();
                                                for (int i16 = i15; i16 < size; i16++) {
                                                    valueOf = Integer.valueOf(((O0.l) listOf.get(i16)).alpha | valueOf.intValue());
                                                }
                                                lVar = new O0.l(valueOf.intValue());
                                            } else if (i5 != 0) {
                                                lVar = lVar2;
                                            } else if (i10 != 0) {
                                                lVar = lVar3;
                                            } else {
                                                lVar = O0.l.bravo;
                                            }
                                        } else if (readByte == 12) {
                                            if (parcel.dataAvail() < 20) {
                                                break;
                                            }
                                            arVar = new a0.ar(c1718a.tango(), (Float.floatToRawIntBits(parcel.readFloat()) << 32) | (Float.floatToRawIntBits(parcel.readFloat()) & 4294967295L), parcel.readFloat());
                                        }
                                        b2 = 1;
                                    }
                                }
                                arrayList.add(new D0.e(new D0.af(j5, j7, vVar, rVar, sVar, (H0.k) null, str, j10, aVar2, pVar, (K0.b) null, j6, lVar, arVar, 49152), spanStart, spanEnd));
                            }
                            if (i14 == length2) {
                                break;
                            }
                            i14++;
                            i12 = i15;
                            b2 = 1;
                        }
                    }
                    obj3 = new D0.g(text.toString(), arrayList, null, 4);
                }
            } else {
                obj3 = null;
            }
        }
        return Unit.INSTANCE;
    }
}
