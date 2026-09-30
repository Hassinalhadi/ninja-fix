package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.P0;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0622q {
    public final ViewGroup alpha;
    public final ArrayList bravo;
    public final ArrayList charlie;
    public boolean delta;
    public boolean echo;
    public boolean foxtrot;

    public C0622q(ViewGroup container) {
        Intrinsics.echo(container, "container");
        this.alpha = container;
        this.bravo = new ArrayList();
        this.charlie = new ArrayList();
    }

    public static void foxtrot(bv.e eVar, View view) {
        WeakHashMap weakHashMap = s1.au.alpha;
        String foxtrot = s1.al.foxtrot(view);
        if (foxtrot != null) {
            eVar.put(foxtrot, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    foxtrot(eVar, childAt);
                }
            }
        }
    }

    public static final C0622q juliet(ViewGroup container, L fragmentManager) {
        Intrinsics.echo(container, "container");
        Intrinsics.echo(fragmentManager, "fragmentManager");
        Intrinsics.delta(fragmentManager.fuchsia(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0622q) {
            return (C0622q) tag;
        }
        C0622q c0622q = new C0622q(container);
        container.setTag(R.id.special_effects_controller_view_tag, c0622q);
        return c0622q;
    }

    public static boolean kilo(ArrayList arrayList) {
        boolean z2;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z2 = true;
            while (it.hasNext()) {
                i0 i0Var = (i0) it.next();
                if (!i0Var.kilo.isEmpty()) {
                    ArrayList arrayList2 = i0Var.kilo;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((h0) it2.next()).alpha()) {
                                break;
                            }
                        }
                    }
                }
                z2 = false;
            }
            break loop0;
        }
        if (z2) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList3, ((i0) it3.next()).kilo);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void alpha(i0 operation) {
        Intrinsics.echo(operation, "operation");
        if (operation.india) {
            int i4 = operation.alpha;
            View requireView = operation.charlie.requireView();
            Intrinsics.delta(requireView, "operation.fragment.requireView()");
            P0.yankee(i4, requireView, this.alpha);
            operation.india = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0498, code lost:
    
        if (((android.animation.AnimatorSet) r5.bravo) != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x049e, code lost:
    
        r5 = r6.charlie;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04a6, code lost:
    
        if (r6.kilo.isEmpty() != false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x04c8, code lost:
    
        if (r6.alpha != 3) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04ca, code lost:
    
        r6.india = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04cf, code lost:
    
        r6.juliet.add(new androidx.fragment.app.C0612g(r4));
        r10 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04ac, code lost:
    
        if (androidx.fragment.app.L.gray(r18) == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04ae, code lost:
    
        android.util.Log.v(r15, "Ignoring Animator set on " + r5 + " as this Fragment was involved in a Transition.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x049a, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04dc, code lost:
    
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04e4, code lost:
    
        if (r1.hasNext() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x04e6, code lost:
    
        r3 = (androidx.fragment.app.C0610e) r1.next();
        r4 = r3.alpha;
        r5 = r4.charlie;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04f2, code lost:
    
        if (r2 != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x050f, code lost:
    
        if (r10 == 0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x052c, code lost:
    
        r4.juliet.add(new androidx.fragment.app.C0609d(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0515, code lost:
    
        if (androidx.fragment.app.L.gray(r18) == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0517, code lost:
    
        android.util.Log.v(r15, "Ignoring Animation set on " + r5 + " as Animations cannot run alongside Animators.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04f8, code lost:
    
        if (androidx.fragment.app.L.gray(r18) == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04fa, code lost:
    
        android.util.Log.v(r15, "Ignoring Animation set on " + r5 + " as Animations cannot run alongside Transitions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0537, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c5, code lost:
    
        r7 = new java.util.ArrayList();
        r11 = r7;
        r8 = new java.util.ArrayList();
        r12 = new bv.aw(0);
        r13 = new java.util.ArrayList<>();
        r16 = new java.util.ArrayList();
        r18 = 2;
        r3 = new bv.aw(0);
        r19 = r13;
        r13 = new bv.aw(0);
        r20 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01f2, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01f8, code lost:
    
        if (r20.hasNext() == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01fa, code lost:
    
        r10 = ((androidx.fragment.app.C0621p) r20.next()).delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0204, code lost:
    
        if (r10 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0206, code lost:
    
        if (r6 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0208, code lost:
    
        if (r4 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x020a, code lost:
    
        r10 = r9.yankee(r9.hotel(r10));
        r22 = r15;
        r15 = r4.charlie;
        r2 = r15.getSharedElementSourceNames();
        r23 = r1;
        kotlin.jvm.internal.Intrinsics.delta(r2, "lastIn.fragment.sharedElementSourceNames");
        r1 = r6.charlie;
        r24 = r7;
        r7 = r1.getSharedElementSourceNames();
        r25 = r8;
        kotlin.jvm.internal.Intrinsics.delta(r7, "firstOut.fragment.sharedElementSourceNames");
        r8 = r1.getSharedElementTargetNames();
        r26 = r9;
        kotlin.jvm.internal.Intrinsics.delta(r8, "firstOut.fragment.sharedElementTargetNames");
        r9 = r8.size();
        r27 = r11;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0242, code lost:
    
        if (r11 >= r9) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0244, code lost:
    
        r16 = r9;
        r9 = r2.indexOf(r8.get(r11));
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0251, code lost:
    
        if (r9 == (-1)) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0253, code lost:
    
        r2.set(r9, r7.get(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x025a, code lost:
    
        r11 = r11 + 1;
        r9 = r16;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0261, code lost:
    
        r7 = r15.getSharedElementTargetNames();
        kotlin.jvm.internal.Intrinsics.delta(r7, "lastIn.fragment.sharedElementTargetNames");
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x026a, code lost:
    
        if (r30 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x026c, code lost:
    
        r1.getExitTransitionCallback();
        r15.getEnterTransitionCallback();
        r8 = new kotlin.Pair(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0287, code lost:
    
        if (r8.first != null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x028b, code lost:
    
        if (r8.second != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x028d, code lost:
    
        r8 = r2.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0292, code lost:
    
        if (r11 >= r8) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0294, code lost:
    
        r9 = r2.get(r11);
        r16 = r8;
        kotlin.jvm.internal.Intrinsics.delta(r9, "exitingNames[i]");
        r8 = r7.get(r11);
        kotlin.jvm.internal.Intrinsics.delta(r8, "enteringNames[i]");
        r12.put((java.lang.String) r9, r8);
        r11 = r11 + 1;
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02bb, code lost:
    
        if (androidx.fragment.app.L.gray(2) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02bd, code lost:
    
        android.util.Log.v("FragmentManager", ">>> entering view names <<<");
        r8 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02cc, code lost:
    
        if (r8.hasNext() == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02ce, code lost:
    
        android.util.Log.v("FragmentManager", "Name: " + r8.next());
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02e8, code lost:
    
        android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
        r8 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02f5, code lost:
    
        if (r8.hasNext() == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02f7, code lost:
    
        android.util.Log.v("FragmentManager", "Name: " + ((java.lang.String) r8.next()));
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0311, code lost:
    
        r1 = r1.mView;
        kotlin.jvm.internal.Intrinsics.delta(r1, "firstOut.fragment.mView");
        foxtrot(r3, r1);
        r3.mike(r2);
        r12.mike(r3.keySet());
        r1 = r15.mView;
        kotlin.jvm.internal.Intrinsics.delta(r1, "lastIn.fragment.mView");
        foxtrot(r13, r1);
        r13.mike(r7);
        r13.mike(r12.values());
        r1 = androidx.fragment.app.W.alpha;
        r1 = r12.red - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0340, code lost:
    
        if ((-1) >= r1) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x034c, code lost:
    
        if (r13.containsKey((java.lang.String) r12.juliet(r1)) != false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x034e, code lost:
    
        r12.hotel(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0351, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0353, code lost:
    
        r15 = 25;
        kotlin.collections.CollectionsKt.h((Oe.ah) r3.entrySet(), new A0.p(r15, r12.keySet()));
        kotlin.collections.CollectionsKt.h((Oe.ah) r13.entrySet(), new A0.p(r15, r12.values()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x037d, code lost:
    
        if (r12.isEmpty() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03be, code lost:
    
        r16 = r2;
        r19 = r7;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03c4, code lost:
    
        r15 = r22;
        r1 = r23;
        r7 = r24;
        r8 = r25;
        r9 = r26;
        r11 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x037f, code lost:
    
        android.util.Log.i("FragmentManager", "Ignoring shared elements transition " + r10 + " between " + r6 + " and " + r4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
        r24.clear();
        r25.clear();
        r16 = r2;
        r19 = r7;
        r15 = r22;
        r1 = r23;
        r7 = r24;
        r8 = r25;
        r9 = r26;
        r11 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03d8, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03de, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0279, code lost:
    
        r1.getEnterTransitionCallback();
        r15.getExitTransitionCallback();
        r8 = new kotlin.Pair(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03df, code lost:
    
        r23 = r1;
        r24 = r7;
        r25 = r8;
        r26 = r9;
        r27 = r11;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03ef, code lost:
    
        r23 = r1;
        r24 = r7;
        r25 = r8;
        r26 = r9;
        r27 = r11;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03fb, code lost:
    
        if (r21 != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0401, code lost:
    
        if (r27.isEmpty() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0405, code lost:
    
        r1 = r27.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x040d, code lost:
    
        if (r1.hasNext() == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0417, code lost:
    
        if (((androidx.fragment.app.C0621p) r1.next()).bravo != null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x041a, code lost:
    
        r15 = "FragmentManager";
        r1 = new androidx.fragment.app.C0620o(r27, r6, r4, r26, r21, r24, r25, r12, r19, r16, r3, r13, r30);
        r2 = r27.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0439, code lost:
    
        if (r2.hasNext() == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x043b, code lost:
    
        ((androidx.fragment.app.C0621p) r2.next()).alpha.juliet.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (androidx.fragment.app.L.gray(2) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        android.util.Log.v("FragmentManager", "Executing operations from " + r6 + " to " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
    
        r1 = new java.util.ArrayList();
        r7 = new java.util.ArrayList();
        r8 = ((androidx.fragment.app.i0) kotlin.collections.CollectionsKt.ochre(r29)).charlie;
        r9 = r29.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
    
        if (r9.hasNext() == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
    
        r11 = ((androidx.fragment.app.i0) r9.next()).charlie.mAnimationInfo;
        r12 = r8.mAnimationInfo;
        r11.bravo = r12.bravo;
        r11.charlie = r12.charlie;
        r11.delta = r12.delta;
        r11.echo = r12.echo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0105, code lost:
    
        r8 = r29.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0109, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
    
        if (r8.hasNext() == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0110, code lost:
    
        r9 = (androidx.fragment.app.i0) r8.next();
        r1.add(new androidx.fragment.app.C0610e(r9, r30));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0120, code lost:
    
        if (r30 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0122, code lost:
    
        if (r9 != r6) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0124, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
    
        r7.add(new androidx.fragment.app.C0621p(r9, r30, r10));
        r9.delta.add(new androidx.fragment.app.g0(r28, r9, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0126, code lost:
    
        if (r9 != r4) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013a, code lost:
    
        r8 = new java.util.ArrayList();
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0147, code lost:
    
        if (r7.hasNext() == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        r9 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0154, code lost:
    
        if (((androidx.fragment.app.C0621p) r9).alpha() != false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        r8.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
    
        r7 = new java.util.ArrayList();
        r8 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0167, code lost:
    
        if (r8.hasNext() == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
    
        r9 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0174, code lost:
    
        if (((androidx.fragment.app.C0621p) r9).bravo() == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0176, code lost:
    
        r7.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
    
        r8 = r7.iterator();
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        if (r8.hasNext() == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0185, code lost:
    
        r11 = (androidx.fragment.app.C0621p) r8.next();
        r12 = r11.bravo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018f, code lost:
    
        if (r9 == null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0191, code lost:
    
        if (r12 != r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0194, code lost:
    
        r1 = new java.lang.StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
        r1.append(r11.alpha.charlie);
        r1.append(" returned Transition ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b8, code lost:
    
        throw new java.lang.IllegalArgumentException(androidx.appcompat.widget.P0.emerald(r1, r11.bravo, " which uses a different Transition type than other Fragments.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bb, code lost:
    
        if (r9 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bd, code lost:
    
        r23 = r1;
        r18 = 2;
        r22 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0403, code lost:
    
        r15 = "FragmentManager";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0449, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = new java.util.ArrayList();
        r3 = r23.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x045b, code lost:
    
        if (r3.hasNext() == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x045d, code lost:
    
        kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r2, ((androidx.fragment.app.C0610e) r3.next()).alpha.kilo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x046b, code lost:
    
        r2 = r2.isEmpty();
        r3 = r23.iterator();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0478, code lost:
    
        if (r3.hasNext() == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x047a, code lost:
    
        r4 = (androidx.fragment.app.C0610e) r3.next();
        r5 = r28.alpha.getContext();
        r6 = r4.alpha;
        kotlin.jvm.internal.Intrinsics.delta(r5, "context");
        r5 = r4.bravo(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0491, code lost:
    
        if (r5 != null) goto L228;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bv.e, bv.aw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bravo(ArrayList arrayList, boolean z2) {
        float f5;
        Object obj;
        i0 i0Var;
        int i4 = 1;
        if (L.gray(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                i0 i0Var2 = (i0) obj;
                f5 = 0.0f;
                View view = i0Var2.charlie.mView;
                Intrinsics.delta(view, "operation.fragment.mView");
                if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                    int visibility = view.getVisibility();
                    if (visibility != 0) {
                        if (visibility != 4 && visibility != 8) {
                            throw new IllegalArgumentException(ao.ad.zulu(visibility, "Unknown visibility "));
                        }
                    } else if (i0Var2.alpha != 2) {
                        break;
                    }
                }
            } else {
                f5 = 0.0f;
                obj = null;
                break;
            }
        }
        i0 i0Var3 = (i0) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                i0Var = listIterator.previous();
                i0 i0Var4 = (i0) i0Var;
                View view2 = i0Var4.charlie.mView;
                Intrinsics.delta(view2, "operation.fragment.mView");
                if (view2.getAlpha() != f5 || view2.getVisibility() != 0) {
                    int visibility2 = view2.getVisibility();
                    if (visibility2 == 0) {
                        continue;
                    } else if (visibility2 != 4 && visibility2 != 8) {
                        throw new IllegalArgumentException(ao.ad.zulu(visibility2, "Unknown visibility "));
                    }
                }
                if (i0Var4.alpha == 2) {
                    break;
                }
            } else {
                i0Var = 0;
                break;
            }
        }
    }

    public final void charlie(ArrayList operations) {
        Intrinsics.echo(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((i0) it.next()).kilo);
        }
        List z2 = CollectionsKt.z(CollectionsKt.D(arrayList));
        int size = z2.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((h0) z2.get(i4)).charlie(this.alpha);
        }
        int size2 = operations.size();
        for (int i5 = 0; i5 < size2; i5++) {
            alpha((i0) operations.get(i5));
        }
        List z10 = CollectionsKt.z(operations);
        int size3 = z10.size();
        for (int i10 = 0; i10 < size3; i10++) {
            i0 i0Var = (i0) z10.get(i10);
            if (i0Var.kilo.isEmpty()) {
                i0Var.bravo();
            }
        }
    }

    public final void delta(int i4, int i5, S s3) {
        synchronized (this.bravo) {
            try {
                ai aiVar = s3.charlie;
                Intrinsics.delta(aiVar, "fragmentStateManager.fragment");
                i0 golf = golf(aiVar);
                if (golf == null) {
                    ai aiVar2 = s3.charlie;
                    if (!aiVar2.mTransitioning && !aiVar2.mRemoving) {
                        golf = null;
                    }
                    golf = hotel(aiVar2);
                }
                if (golf != null) {
                    golf.delta(i4, i5);
                    return;
                }
                i0 i0Var = new i0(i4, i5, s3);
                this.bravo.add(i0Var);
                i0Var.delta.add(new g0(this, i0Var, 0));
                i0Var.delta.add(new g0(this, i0Var, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void echo() {
        boolean z2;
        if (this.foxtrot) {
            return;
        }
        if (!this.alpha.isAttachedToWindow()) {
            india();
            this.echo = false;
            return;
        }
        synchronized (this.bravo) {
            try {
                ArrayList B = CollectionsKt.B(this.charlie);
                this.charlie.clear();
                Iterator it = B.iterator();
                while (true) {
                    z2 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    i0 i0Var = (i0) it.next();
                    if (this.bravo.isEmpty() || !i0Var.charlie.mTransitioning) {
                        z2 = false;
                    }
                    i0Var.golf = z2;
                }
                Iterator it2 = B.iterator();
                while (it2.hasNext()) {
                    i0 i0Var2 = (i0) it2.next();
                    if (this.delta) {
                        if (L.gray(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + i0Var2);
                        }
                        i0Var2.bravo();
                    } else {
                        if (L.gray(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + i0Var2);
                        }
                        i0Var2.alpha(this.alpha);
                    }
                    this.delta = false;
                    if (!i0Var2.foxtrot) {
                        this.charlie.add(i0Var2);
                    }
                }
                if (!this.bravo.isEmpty()) {
                    november();
                    ArrayList B6 = CollectionsKt.B(this.bravo);
                    if (B6.isEmpty()) {
                        return;
                    }
                    this.bravo.clear();
                    this.charlie.addAll(B6);
                    if (L.gray(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    bravo(B6, this.echo);
                    boolean kilo = kilo(B6);
                    Iterator it3 = B6.iterator();
                    boolean z10 = true;
                    while (it3.hasNext()) {
                        if (!((i0) it3.next()).charlie.mTransitioning) {
                            z10 = false;
                        }
                    }
                    if (!z10 || kilo) {
                        z2 = false;
                    }
                    this.delta = z2;
                    if (L.gray(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + kilo + " \ntransition = " + z10);
                    }
                    if (!z10) {
                        mike(B6);
                        charlie(B6);
                    } else if (kilo) {
                        mike(B6);
                        int size = B6.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            alpha((i0) B6.get(i4));
                        }
                    }
                    this.echo = false;
                    if (L.gray(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i0 golf(ai aiVar) {
        Object obj;
        Iterator it = this.bravo.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                i0 i0Var = (i0) obj;
                if (Intrinsics.areEqual(i0Var.charlie, aiVar) && !i0Var.echo) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (i0) obj;
    }

    public final i0 hotel(ai aiVar) {
        Object obj;
        Iterator it = this.charlie.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                i0 i0Var = (i0) obj;
                if (Intrinsics.areEqual(i0Var.charlie, aiVar) && !i0Var.echo) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (i0) obj;
    }

    public final void india() {
        String str;
        String str2;
        if (L.gray(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.alpha.isAttachedToWindow();
        synchronized (this.bravo) {
            try {
                november();
                mike(this.bravo);
                ArrayList B = CollectionsKt.B(this.charlie);
                Iterator it = B.iterator();
                while (it.hasNext()) {
                    ((i0) it.next()).golf = false;
                }
                Iterator it2 = B.iterator();
                while (it2.hasNext()) {
                    i0 i0Var = (i0) it2.next();
                    if (L.gray(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.alpha + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + i0Var);
                    }
                    i0Var.alpha(this.alpha);
                }
                ArrayList B6 = CollectionsKt.B(this.bravo);
                Iterator it3 = B6.iterator();
                while (it3.hasNext()) {
                    ((i0) it3.next()).golf = false;
                }
                Iterator it4 = B6.iterator();
                while (it4.hasNext()) {
                    i0 i0Var2 = (i0) it4.next();
                    if (L.gray(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.alpha + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + i0Var2);
                    }
                    i0Var2.alpha(this.alpha);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void lima() {
        ai aiVar;
        Object obj;
        boolean z2;
        synchronized (this.bravo) {
            try {
                november();
                ArrayList arrayList = this.bravo;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    aiVar = null;
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        i0 i0Var = (i0) obj;
                        View view = i0Var.charlie.mView;
                        Intrinsics.delta(view, "operation.fragment.mView");
                        char c3 = 4;
                        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                            int visibility = view.getVisibility();
                            if (visibility != 0) {
                                if (visibility != 4) {
                                    if (visibility == 8) {
                                        c3 = 3;
                                    } else {
                                        throw new IllegalArgumentException("Unknown visibility " + visibility);
                                    }
                                }
                            } else {
                                c3 = 2;
                            }
                        }
                        if (i0Var.alpha == 2 && c3 != 2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                i0 i0Var2 = (i0) obj;
                if (i0Var2 != null) {
                    aiVar = i0Var2.charlie;
                }
                if (aiVar != null) {
                    z2 = aiVar.isPostponed();
                } else {
                    z2 = false;
                }
                this.foxtrot = z2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void mike(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            i0 i0Var = (i0) arrayList.get(i4);
            if (!i0Var.hotel) {
                i0Var.hotel = true;
                int i5 = i0Var.bravo;
                S s3 = i0Var.lima;
                if (i5 == 2) {
                    ai aiVar = s3.charlie;
                    Intrinsics.delta(aiVar, "fragmentStateManager.fragment");
                    View findFocus = aiVar.mView.findFocus();
                    if (findFocus != null) {
                        aiVar.setFocusedView(findFocus);
                        if (L.gray(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + aiVar);
                        }
                    }
                    View requireView = i0Var.charlie.requireView();
                    Intrinsics.delta(requireView, "this.fragment.requireView()");
                    if (requireView.getParent() == null) {
                        if (L.gray(2)) {
                            Log.v("FragmentManager", "Adding fragment " + aiVar + " view " + requireView + " to container in onStart");
                        }
                        s3.bravo();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        if (L.gray(2)) {
                            Log.v("FragmentManager", "Making view " + requireView + " INVISIBLE in onStart");
                        }
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(aiVar.getPostOnViewCreatedAlpha());
                    if (L.gray(2)) {
                        Log.v("FragmentManager", "Setting view alpha to " + aiVar.getPostOnViewCreatedAlpha() + " in onStart");
                    }
                } else if (i5 == 3) {
                    ai aiVar2 = s3.charlie;
                    Intrinsics.delta(aiVar2, "fragmentStateManager.fragment");
                    View requireView2 = aiVar2.requireView();
                    Intrinsics.delta(requireView2, "fragment.requireView()");
                    if (L.gray(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + aiVar2);
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ((i0) it.next()).kilo);
        }
        List z2 = CollectionsKt.z(CollectionsKt.D(arrayList2));
        int size2 = z2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            h0 h0Var = (h0) z2.get(i10);
            h0Var.getClass();
            ViewGroup container = this.alpha;
            Intrinsics.echo(container, "container");
            if (!h0Var.alpha) {
                h0Var.echo(container);
            }
            h0Var.alpha = true;
        }
    }

    public final void november() {
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            int i4 = 2;
            if (i0Var.bravo == 2) {
                View requireView = i0Var.charlie.requireView();
                Intrinsics.delta(requireView, "fragment.requireView()");
                int visibility = requireView.getVisibility();
                if (visibility != 0) {
                    i4 = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i4 = 3;
                        } else {
                            throw new IllegalArgumentException(ao.ad.zulu(visibility, "Unknown visibility "));
                        }
                    }
                }
                i0Var.delta(i4, 1);
            }
        }
    }
}
