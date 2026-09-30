package B9;

import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.C2544d;
import s0.C2563x;
import t0.C2907c0;

/* renamed from: B9.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0058p {
    public final /* synthetic */ int alpha = 3;
    public Object bravo;
    public Object charlie;
    public Object delta;
    public Object echo;
    public Object foxtrot;
    public Object golf;
    public Object hotel;
    public Object india;
    public Object juliet;
    public Object kilo;

    public /* synthetic */ C0058p() {
    }

    public static final void alpha(C0058p c0058p, T.r rVar, s0.L l10) {
        C2563x c2563x;
        c0058p.getClass();
        for (T.r parent$ui_release = rVar.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (parent$ui_release == ((s0.H) c0058p.charlie)) {
                s0.al victor = ((s0.al) c0058p.bravo).victor();
                if (victor != null) {
                    c2563x = (C2563x) victor.f13305x.echo;
                } else {
                    c2563x = null;
                }
                l10.f13253k = c2563x;
                c0058p.foxtrot = l10;
                return;
            }
            if ((parent$ui_release.getKindSet$ui_release() & 2) == 0) {
                parent$ui_release.updateCoordinator$ui_release(l10);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [s0.d, T.r] */
    public static T.r delta(T.q qVar, T.r rVar) {
        T.r rVar2;
        if (qVar instanceof s0.F) {
            rVar2 = ((s0.F) qVar).create();
            rVar2.setKindSet$ui_release(s0.M.golf(rVar2));
        } else {
            ?? rVar3 = new T.r();
            rVar3.setKindSet$ui_release(s0.M.echo(qVar));
            rVar3.alpha = qVar;
            rVar3.red = new HashSet();
            rVar2 = rVar3;
        }
        if (rVar2.isAttached()) {
            AbstractC2264a.bravo("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        rVar2.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        T.r child$ui_release = rVar.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(rVar2);
            rVar2.setChild$ui_release(child$ui_release);
        }
        rVar.setChild$ui_release(rVar2);
        rVar2.setParent$ui_release(rVar);
        return rVar2;
    }

    public static T.r echo(T.r rVar) {
        if (rVar.isAttached()) {
            bv.ag agVar = s0.M.alpha;
            if (!rVar.isAttached()) {
                AbstractC2264a.bravo("autoInvalidateRemovedNode called on unattached node");
            }
            s0.M.bravo(rVar, -1, 2);
            rVar.runDetachLifecycle$ui_release();
            rVar.markAsDetached$ui_release();
        }
        T.r child$ui_release = rVar.getChild$ui_release();
        T.r parent$ui_release = rVar.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            rVar.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            rVar.setParent$ui_release(null);
        }
        Intrinsics.checkNotNull(parent$ui_release);
        return parent$ui_release;
    }

    public static void juliet(T.q qVar, T.q qVar2, T.r rVar) {
        if ((qVar instanceof s0.F) && (qVar2 instanceof s0.F)) {
            Intrinsics.charlie(rVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((s0.F) qVar2).update(rVar);
            if (rVar.isAttached()) {
                s0.M.delta(rVar);
                return;
            } else {
                rVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (rVar instanceof C2544d) {
            C2544d c2544d = (C2544d) rVar;
            if (c2544d.isAttached()) {
                c2544d.c();
            }
            c2544d.alpha = qVar2;
            c2544d.setKindSet$ui_release(s0.M.echo(qVar2));
            if (c2544d.isAttached()) {
                c2544d.b(false);
            }
            if (rVar.isAttached()) {
                s0.M.delta(rVar);
                return;
            } else {
                rVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        AbstractC2264a.bravo("Unknown Modifier.Node type");
    }

    public void bravo(String str, String str2) {
        HashMap hashMap = (HashMap) this.delta;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public E5.h charlie() {
        String str;
        if (((String) this.bravo) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((E5.l) this.echo) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.foxtrot) == null) {
            str = androidx.appcompat.widget.P0.crimson(str, " eventMillis");
        }
        if (((Long) this.golf) == null) {
            str = androidx.appcompat.widget.P0.crimson(str, " uptimeMillis");
        }
        if (((HashMap) this.delta) == null) {
            str = androidx.appcompat.widget.P0.crimson(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new E5.h((String) this.bravo, (Integer) this.charlie, (E5.l) this.echo, ((Long) this.foxtrot).longValue(), ((Long) this.golf).longValue(), (HashMap) this.delta, (Integer) this.hotel, (String) this.india, (byte[]) this.juliet, (byte[]) this.kilo);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean foxtrot(int i4) {
        if ((i4 & ((T.r) this.delta).getAggregateChildKindSet$ui_release()) != 0) {
            return true;
        }
        return false;
    }

    public void golf() {
        for (T.r rVar = (T.r) this.delta; rVar != null; rVar = rVar.getChild$ui_release()) {
            rVar.runAttachLifecycle$ui_release();
            if (rVar.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                s0.M.alpha(rVar);
            }
            if (rVar.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                s0.M.delta(rVar);
            }
            rVar.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            rVar.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018c, code lost:
    
        r26 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0191, code lost:
    
        r24 = r21 + (r24 & r26);
        r21 = r5;
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019b, code lost:
    
        if (r12 <= r13) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019d, code lost:
    
        if (r5 <= r9) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019f, code lost:
    
        r26 = r5;
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ab, code lost:
    
        if (r0.alpha(r12 - 1, r26 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ad, code lost:
    
        r12 = r12 - 1;
        r5 = r26 - 1;
        r11 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b8, code lost:
    
        r25[r16 + r27] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bc, code lost:
    
        if (r23 == 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01be, code lost:
    
        r5 = r18 - r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c0, code lost:
    
        if (r5 < r10) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c2, code lost:
    
        if (r5 > r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c8, code lost:
    
        if (r19[r16 + r5] < r12) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ca, code lost:
    
        r28[r32] = r12;
        r10 = 1;
        r28[1] = r26;
        r28[r31] = r21;
        r28[3] = r24;
        r28[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025e, code lost:
    
        r11 = r27 + 2;
        r5 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b4, code lost:
    
        r26 = r5;
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x018f, code lost:
    
        r26 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0188, code lost:
    
        r24 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0176, code lost:
    
        r5 = r25[(r11 + 1) + r16];
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0169, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0174, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0264, code lost:
    
        r3 = r3 + 1;
        r10 = r19;
        r5 = r20;
        r11 = r25;
        r12 = r28;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x014f, code lost:
    
        r5 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cb, code lost:
    
        if (r19[(r5 + 1) + r16] > r19[(r24 - 1) + r16]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        r25 = r11;
        r28 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
    
        if ((r18 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0151, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0152, code lost:
    
        if (r11 > r3) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0154, code lost:
    
        if (r11 == r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0156, code lost:
    
        if (r11 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0166, code lost:
    
        if (r25[(r11 + 1) + r16] >= r25[(r11 - 1) + r16]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016b, code lost:
    
        r5 = r25[(r11 - 1) + r16];
        r12 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017d, code lost:
    
        r21 = r6 - ((r14 - r12) - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0183, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0185, code lost:
    
        r24 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018a, code lost:
    
        if (r12 != r5) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void hotel(int i4, J.e eVar, J.e eVar2, T.r rVar, boolean z2) {
        int i5;
        J.e eVar3;
        J.e eVar4;
        int i10;
        C0058p c0058p;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i11;
        char c3;
        char c4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        androidx.camera.core.impl.ax axVar = (androidx.camera.core.impl.ax) this.kilo;
        if (axVar == null) {
            i5 = i4;
            eVar3 = eVar;
            eVar4 = eVar2;
            axVar = new androidx.camera.core.impl.ax(this, rVar, i5, eVar3, eVar4, z2);
            this.kilo = axVar;
        } else {
            i5 = i4;
            eVar3 = eVar;
            eVar4 = eVar2;
            axVar.red = rVar;
            axVar.alpha = i5;
            axVar.silver = eVar3;
            axVar.teal = eVar4;
            axVar.purple = z2;
        }
        int i22 = eVar3.red - i5;
        int i23 = eVar4.red - i5;
        int i24 = 1;
        char c10 = 2;
        int i25 = ((i22 + i23) + 1) / 2;
        androidx.compose.runtime.al alVar = new androidx.compose.runtime.al(i25 * 3);
        androidx.compose.runtime.al alVar2 = new androidx.compose.runtime.al(i25 * 4);
        int i26 = 0;
        alVar2.echo(0, i22, 0, i23);
        int i27 = (i25 * 2) + 1;
        int[] iArr4 = new int[i27];
        int[] iArr5 = new int[i27];
        int[] iArr6 = new int[5];
        while (true) {
            int i28 = alVar2.bravo;
            if (i28 == 0) {
                break;
            }
            int[] iArr7 = alVar2.alpha;
            char c11 = c10;
            int i29 = i28 - 1;
            alVar2.bravo = i29;
            int i30 = iArr7[i29];
            int i31 = i26;
            int i32 = i28 - 2;
            alVar2.bravo = i32;
            int i33 = iArr7[i32];
            int i34 = i28 - 3;
            alVar2.bravo = i34;
            int i35 = iArr7[i34];
            int i36 = i28 - 4;
            alVar2.bravo = i36;
            int i37 = iArr7[i36];
            int i38 = i35 - i37;
            int i39 = i27;
            int i40 = i30 - i33;
            if (i38 >= i24 && i40 >= i24) {
                int i41 = i24;
                int i42 = ((i38 + i40) + 1) / 2;
                int i43 = i39 / 2;
                int i44 = i43 + 1;
                iArr4[i44] = i37;
                iArr5[i44] = i35;
                int i45 = i31;
                while (i45 < i42) {
                    int i46 = i38 - i40;
                    int i47 = i42;
                    iArr = iArr4;
                    if ((Math.abs(i46) & 1) == i41) {
                        i11 = 1;
                    } else {
                        i11 = i31;
                    }
                    int i48 = -i45;
                    int i49 = i11;
                    int i50 = i48;
                    while (true) {
                        if (i50 > i45) {
                            break;
                        }
                        if (i50 != i48) {
                            if (i50 != i45) {
                                i16 = i50;
                                iArr2 = iArr5;
                            } else {
                                i16 = i50;
                                iArr2 = iArr5;
                            }
                            i17 = iArr[(i16 - 1) + i43];
                            i18 = i17 + 1;
                            int i51 = ((i18 - i37) + i33) - i16;
                            if (i45 == 0) {
                                i19 = 1;
                            } else {
                                i19 = i31;
                            }
                            if (i18 != i17) {
                                i20 = 1;
                            } else {
                                i20 = i31;
                            }
                            int i52 = i51 - (i19 & i20);
                            int i53 = i17;
                            i21 = i51;
                            while (i18 < i35 && i21 < i30 && axVar.alpha(i18, i21)) {
                                i18++;
                                i21++;
                            }
                            iArr[i43 + i16] = i18;
                            if (i49 == 0) {
                                int i54 = i21;
                                int i55 = i46 - i16;
                                iArr3 = iArr6;
                                if (i55 >= i48 + 1 && i55 <= i45 - 1 && iArr2[i43 + i55] <= i18) {
                                    iArr3[i31] = i53;
                                    iArr3[1] = i52;
                                    iArr3[c11] = i18;
                                    iArr3[3] = i54;
                                    iArr3[4] = i31;
                                    c3 = 1;
                                    break;
                                }
                            } else {
                                iArr3 = iArr6;
                            }
                            i50 = i16 + 2;
                            iArr5 = iArr2;
                            iArr6 = iArr3;
                        } else {
                            i16 = i50;
                            iArr2 = iArr5;
                        }
                        i17 = iArr[i16 + 1 + i43];
                        i18 = i17;
                        int i512 = ((i18 - i37) + i33) - i16;
                        if (i45 == 0) {
                        }
                        if (i18 != i17) {
                        }
                        int i522 = i512 - (i19 & i20);
                        int i532 = i17;
                        i21 = i512;
                        while (i18 < i35) {
                            i18++;
                            i21++;
                        }
                        iArr[i43 + i16] = i18;
                        if (i49 == 0) {
                        }
                        i50 = i16 + 2;
                        iArr5 = iArr2;
                        iArr6 = iArr3;
                    }
                    if (Math.min(iArr3[c11] - iArr3[i31], iArr3[3] - iArr3[c3]) > 0) {
                        int i56 = iArr3[i31];
                        int i57 = iArr3[c3];
                        int i58 = iArr3[3] - i57;
                        int i59 = iArr3[c11] - i56;
                        if (i58 != i59) {
                            i59 = Math.min(i59, i58);
                            int i60 = iArr3[4];
                            if (i60 != 0) {
                                i12 = 1;
                            } else {
                                i12 = i31;
                            }
                            int i61 = iArr3[3];
                            c4 = 1;
                            int i62 = iArr3[1];
                            int i63 = i61 - i62;
                            int i64 = iArr3[c11];
                            int i65 = iArr3[i31];
                            if (i63 > i64 - i65) {
                                i13 = 1;
                            } else {
                                i13 = i31;
                            }
                            i56 += (i13 | i12) ^ 1;
                            if (i60 != 0) {
                                i14 = 1;
                            } else {
                                i14 = i31;
                            }
                            if (i61 - i62 > i64 - i65) {
                                i15 = 1;
                            } else {
                                i15 = i31;
                            }
                            i57 += (i14 | (i15 ^ 1)) ^ 1;
                        } else {
                            c4 = 1;
                        }
                        alVar.delta(i56, i57, i59);
                    } else {
                        c4 = c3;
                    }
                    alVar2.echo(i37, iArr3[i31], i33, iArr3[c4]);
                    alVar2.echo(iArr3[c11], i35, iArr3[3], i30);
                    c10 = c11;
                    i26 = i31;
                    i27 = i39;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                    iArr6 = iArr3;
                    i24 = 1;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            iArr3 = iArr6;
            c10 = c11;
            i26 = i31;
            i27 = i39;
            iArr4 = iArr;
            iArr5 = iArr2;
            iArr6 = iArr3;
            i24 = 1;
        }
        int i66 = i26;
        int i67 = alVar.bravo;
        if (i67 % 3 != 0) {
            AbstractC2264a.bravo("Array size not a multiple of 3");
        }
        if (i67 > 3) {
            i10 = i66;
            alVar.foxtrot(i10, i67 - 3);
        } else {
            i10 = i66;
        }
        alVar.delta(i22, i23, i10);
        int i68 = i10;
        int i69 = i68;
        int i70 = i69;
        while (i68 < alVar.bravo) {
            int[] iArr8 = alVar.alpha;
            int i71 = iArr8[i68];
            int i72 = iArr8[i68 + 2];
            int i73 = i71 - i72;
            int i74 = iArr8[i68 + 1] - i72;
            i68 += 3;
            while (true) {
                c0058p = (C0058p) axVar.white;
                if (i69 >= i73) {
                    break;
                }
                T.r child$ui_release = ((T.r) axVar.red).getChild$ui_release();
                Intrinsics.checkNotNull(child$ui_release);
                c0058p.getClass();
                if ((child$ui_release.getKindSet$ui_release() & 2) != 0) {
                    s0.L coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                    Intrinsics.checkNotNull(coordinator$ui_release);
                    s0.L l10 = coordinator$ui_release.f13253k;
                    s0.L l11 = coordinator$ui_release.f13252j;
                    Intrinsics.checkNotNull(l11);
                    if (l10 != null) {
                        l10.f13252j = l11;
                    }
                    l11.f13253k = l10;
                    alpha(c0058p, (T.r) axVar.red, l11);
                }
                axVar.red = echo(child$ui_release);
                i69++;
            }
            while (i70 < i74) {
                int i75 = axVar.alpha + i70;
                T.r rVar2 = (T.r) axVar.red;
                T.q qVar = (T.q) ((J.e) axVar.teal).alpha[i75];
                c0058p.getClass();
                T.r delta = delta(qVar, rVar2);
                axVar.red = delta;
                if (axVar.purple) {
                    T.r child$ui_release2 = delta.getChild$ui_release();
                    Intrinsics.checkNotNull(child$ui_release2);
                    s0.L coordinator$ui_release2 = child$ui_release2.getCoordinator$ui_release();
                    Intrinsics.checkNotNull(coordinator$ui_release2);
                    s0.ab charlie = AbstractC2555o.charlie((T.r) axVar.red);
                    if (charlie != null) {
                        s0.ad adVar = new s0.ad((s0.al) c0058p.bravo, charlie);
                        ((T.r) axVar.red).updateCoordinator$ui_release(adVar);
                        alpha(c0058p, (T.r) axVar.red, adVar);
                        adVar.f13253k = coordinator$ui_release2.f13253k;
                        adVar.f13252j = coordinator$ui_release2;
                        coordinator$ui_release2.f13253k = adVar;
                    } else {
                        ((T.r) axVar.red).updateCoordinator$ui_release(coordinator$ui_release2);
                    }
                    ((T.r) axVar.red).markAsAttached$ui_release();
                    ((T.r) axVar.red).runAttachLifecycle$ui_release();
                    s0.M.alpha((T.r) axVar.red);
                } else {
                    delta.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                }
                i70++;
            }
            while (true) {
                int i76 = i72 - 1;
                if (i72 > 0) {
                    T.r child$ui_release3 = ((T.r) axVar.red).getChild$ui_release();
                    Intrinsics.checkNotNull(child$ui_release3);
                    axVar.red = child$ui_release3;
                    J.e eVar5 = (J.e) axVar.silver;
                    int i77 = axVar.alpha;
                    T.q qVar2 = (T.q) eVar5.alpha[i77 + i69];
                    T.q qVar3 = (T.q) ((J.e) axVar.teal).alpha[i77 + i70];
                    if (!Intrinsics.areEqual(qVar2, qVar3)) {
                        T.r rVar3 = (T.r) axVar.red;
                        c0058p.getClass();
                        juliet(qVar2, qVar3, rVar3);
                    } else {
                        c0058p.getClass();
                    }
                    i69++;
                    i70++;
                    i72 = i76;
                }
            }
        }
        int i78 = i10;
        for (T.r parent$ui_release = ((s0.g0) this.golf).getParent$ui_release(); parent$ui_release != null && parent$ui_release != ((s0.H) this.charlie); parent$ui_release = parent$ui_release.getParent$ui_release()) {
            i78 |= parent$ui_release.getKindSet$ui_release();
            parent$ui_release.setAggregateChildKindSet$ui_release(i78);
        }
    }

    public void india() {
        s0.al alVar;
        C2563x c2563x;
        s0.ad adVar;
        T.r parent$ui_release = ((s0.g0) this.golf).getParent$ui_release();
        s0.L l10 = (C2563x) this.echo;
        while (true) {
            alVar = (s0.al) this.bravo;
            if (parent$ui_release == null) {
                break;
            }
            s0.ab charlie = AbstractC2555o.charlie(parent$ui_release);
            if (charlie != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    s0.L coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    Intrinsics.charlie(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    s0.ad adVar2 = (s0.ad) coordinator$ui_release;
                    s0.ab abVar = adVar2.f13271K;
                    adVar2.a0(charlie);
                    adVar = adVar2;
                    if (abVar != parent$ui_release) {
                        s0.U u4 = adVar2.C;
                        adVar = adVar2;
                        if (u4 != null) {
                            ((C2907c0) u4).invalidate();
                            adVar = adVar2;
                        }
                    }
                } else {
                    s0.ad adVar3 = new s0.ad(alVar, charlie);
                    parent$ui_release.updateCoordinator$ui_release(adVar3);
                    adVar = adVar3;
                }
                l10.f13253k = adVar;
                adVar.f13252j = l10;
                l10 = adVar;
            } else {
                parent$ui_release.updateCoordinator$ui_release(l10);
            }
            parent$ui_release = parent$ui_release.getParent$ui_release();
        }
        s0.al victor = alVar.victor();
        if (victor != null) {
            c2563x = (C2563x) victor.f13305x.echo;
        } else {
            c2563x = null;
        }
        l10.f13253k = c2563x;
        this.foxtrot = l10;
    }

    public String toString() {
        switch (this.alpha) {
            case 5:
                StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
                T.r rVar = (T.r) this.delta;
                s0.g0 g0Var = (s0.g0) this.golf;
                if (rVar == g0Var) {
                    sb2.append(Constants.AES_SUFFIX);
                } else {
                    while (true) {
                        if (rVar != null && rVar != g0Var) {
                            sb2.append(String.valueOf(rVar));
                            if (rVar.getChild$ui_release() == g0Var) {
                                sb2.append(Constants.AES_SUFFIX);
                            } else {
                                sb2.append(Constants.SEPARATOR_COMMA);
                                rVar = rVar.getChild$ui_release();
                            }
                        }
                    }
                }
                String sb3 = sb2.toString();
                Intrinsics.delta(sb3, "toString(...)");
                return sb3;
            default:
                return super.toString();
        }
    }

    public C0058p(s0.al alVar) {
        this.bravo = alVar;
        T.r rVar = new T.r();
        rVar.setAggregateChildKindSet$ui_release(-1);
        this.charlie = rVar;
        C2563x c2563x = new C2563x(alVar);
        this.echo = c2563x;
        this.foxtrot = c2563x;
        s0.g0 g0Var = c2563x.f13351K;
        this.golf = g0Var;
        this.delta = g0Var;
        this.juliet = new J.e(new T.s[16]);
    }

    public C0058p(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.bravo = constraintLayout;
        this.charlie = materialButton;
        this.echo = materialButton2;
        this.foxtrot = materialButton3;
        this.golf = linearLayout;
        this.delta = textView;
        this.hotel = textView2;
        this.india = textView3;
        this.juliet = textView4;
        this.kilo = textView5;
    }

    public C0058p(ConstraintLayout constraintLayout, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView) {
        this.bravo = constraintLayout;
        this.charlie = materialButton;
        this.echo = textInputEditText;
        this.foxtrot = textInputEditText2;
        this.golf = textInputEditText3;
        this.hotel = textInputLayout;
        this.india = textInputLayout2;
        this.juliet = recyclerView;
        this.kilo = recyclerView2;
        this.delta = textView;
    }

    public C0058p(ScrollView scrollView, MaterialCardView materialCardView, MaterialCardView materialCardView2, I i4, I i5, I i10, LinearLayout linearLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3) {
        this.bravo = scrollView;
        this.charlie = materialCardView;
        this.echo = materialCardView2;
        this.foxtrot = i4;
        this.delta = i5;
        this.hotel = i10;
        this.golf = linearLayout;
        this.india = shapeableImageView;
        this.juliet = shapeableImageView2;
        this.kilo = shapeableImageView3;
    }

    public C0058p(com.google.android.material.internal.s sVar) {
        this.bravo = sVar.indigo("gcm.n.title");
        sVar.emerald("gcm.n.title");
        Object[] cyan = sVar.cyan("gcm.n.title");
        if (cyan != null) {
            String[] strArr = new String[cyan.length];
            for (int i4 = 0; i4 < cyan.length; i4++) {
                strArr[i4] = String.valueOf(cyan[i4]);
            }
        }
        this.charlie = sVar.indigo("gcm.n.body");
        sVar.emerald("gcm.n.body");
        Object[] cyan2 = sVar.cyan("gcm.n.body");
        if (cyan2 != null) {
            String[] strArr2 = new String[cyan2.length];
            for (int i5 = 0; i5 < cyan2.length; i5++) {
                strArr2[i5] = String.valueOf(cyan2[i5]);
            }
        }
        this.echo = sVar.indigo("gcm.n.icon");
        String indigo = sVar.indigo("gcm.n.sound2");
        this.foxtrot = TextUtils.isEmpty(indigo) ? sVar.indigo("gcm.n.sound") : indigo;
        this.golf = sVar.indigo("gcm.n.tag");
        this.delta = sVar.indigo("gcm.n.color");
        this.hotel = sVar.indigo("gcm.n.click_action");
        this.india = sVar.indigo("gcm.n.android_channel_id");
        String indigo2 = sVar.indigo("gcm.n.link_android");
        indigo2 = TextUtils.isEmpty(indigo2) ? sVar.indigo("gcm.n.link") : indigo2;
        this.juliet = !TextUtils.isEmpty(indigo2) ? Uri.parse(indigo2) : null;
        sVar.indigo("gcm.n.image");
        this.kilo = sVar.indigo("gcm.n.ticker");
        sVar.bronze("gcm.n.notification_priority");
        sVar.bronze("gcm.n.visibility");
        sVar.bronze("gcm.n.notification_count");
        sVar.blue("gcm.n.sticky");
        sVar.blue("gcm.n.local_only");
        sVar.blue("gcm.n.default_sound");
        sVar.blue("gcm.n.default_vibrate_timings");
        sVar.blue("gcm.n.default_light_settings");
        sVar.fuchsia();
        sVar.crimson();
        sVar.ivory();
    }
}
