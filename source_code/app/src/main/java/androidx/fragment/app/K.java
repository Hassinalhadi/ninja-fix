package androidx.fragment.app;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class K implements H {
    public final /* synthetic */ int alpha;
    public final String bravo;
    public final /* synthetic */ L charlie;

    public /* synthetic */ K(L l10, String str, int i4) {
        this.alpha = i4;
        this.charlie = l10;
        this.bravo = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0317, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r8 != 8) goto L34;
     */
    @Override // androidx.fragment.app.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean alpha(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        String str2;
        int i4;
        Iterator it;
        switch (this.alpha) {
            case 0:
                L l10 = this.charlie;
                BackStackState backStackState = (BackStackState) l10.lima.remove(this.bravo);
                boolean z2 = false;
                if (backStackState != null) {
                    HashMap hashMap = new HashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C0606a c0606a = (C0606a) it2.next();
                        if (c0606a.uniform) {
                            Iterator it3 = c0606a.alpha.iterator();
                            while (it3.hasNext()) {
                                ai aiVar = ((U) it3.next()).bravo;
                                if (aiVar != null) {
                                    hashMap.put(aiVar.mWho, aiVar);
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList3 = backStackState.alpha;
                    HashMap hashMap2 = new HashMap(arrayList3.size());
                    for (String str3 : arrayList3) {
                        ai aiVar2 = (ai) hashMap.get(str3);
                        if (aiVar2 != null) {
                            hashMap2.put(aiVar2.mWho, aiVar2);
                        } else {
                            Bundle india = l10.charlie.india(null, str3);
                            if (india != null) {
                                ClassLoader classLoader = l10.xray.purple.getClassLoader();
                                ai charlie = ((FragmentState) india.getParcelable("state")).charlie(l10.emerald());
                                charlie.mSavedFragmentState = india;
                                if (india.getBundle("savedInstanceState") == null) {
                                    charlie.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = india.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                charlie.setArguments(bundle);
                                hashMap2.put(charlie.mWho, charlie);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (BackStackRecordState backStackRecordState : backStackState.purple) {
                        backStackRecordState.getClass();
                        C0606a c0606a2 = new C0606a(l10);
                        backStackRecordState.charlie(c0606a2);
                        int i5 = 0;
                        while (true) {
                            ArrayList arrayList5 = backStackRecordState.purple;
                            if (i5 < arrayList5.size()) {
                                String str4 = (String) arrayList5.get(i5);
                                if (str4 != null) {
                                    ai aiVar3 = (ai) hashMap2.get(str4);
                                    if (aiVar3 != null) {
                                        ((U) c0606a2.alpha.get(i5)).bravo = aiVar3;
                                    } else {
                                        throw new IllegalStateException(com.google.android.material.datepicker.j.lima(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.white, " failed due to missing saved state for Fragment (", str4, ")"));
                                    }
                                }
                                i5++;
                            }
                        }
                    }
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        ((C0606a) it4.next()).alpha(arrayList, arrayList2);
                        z2 = true;
                    }
                }
                return z2;
            default:
                L l11 = this.charlie;
                String str5 = this.bravo;
                int beige = l11.beige(str5, -1, true);
                if (beige < 0) {
                    return false;
                }
                int i10 = beige;
                while (true) {
                    Throwable th = null;
                    if (i10 < l11.delta.size()) {
                        C0606a c0606a3 = (C0606a) l11.delta.get(i10);
                        if (c0606a3.papa) {
                            i10++;
                        } else {
                            l11.white(new IllegalArgumentException("saveBackStack(\"" + str5 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c0606a3 + " that did not use setReorderingAllowed(true)."));
                            throw null;
                        }
                    } else {
                        HashSet hashSet = new HashSet();
                        int i11 = beige;
                        while (i11 < l11.delta.size()) {
                            C0606a c0606a4 = (C0606a) l11.delta.get(i11);
                            HashSet hashSet2 = new HashSet();
                            HashSet hashSet3 = new HashSet();
                            Iterator it5 = c0606a4.alpha.iterator();
                            while (it5.hasNext()) {
                                U u4 = (U) it5.next();
                                Throwable th2 = th;
                                ai aiVar4 = u4.bravo;
                                if (aiVar4 == null) {
                                    th = th2;
                                } else {
                                    if (u4.charlie) {
                                        i4 = i11;
                                        int i12 = u4.alpha;
                                        it = it5;
                                        if (i12 != 1) {
                                            if (i12 != 2) {
                                                break;
                                            }
                                        }
                                    } else {
                                        i4 = i11;
                                        it = it5;
                                    }
                                    hashSet.add(aiVar4);
                                    hashSet2.add(aiVar4);
                                    int i13 = u4.alpha;
                                    if (i13 == 1 || i13 == 2) {
                                        hashSet3.add(aiVar4);
                                    }
                                    th = th2;
                                    i11 = i4;
                                    it5 = it;
                                }
                            }
                            int i14 = i11;
                            Throwable th3 = th;
                            hashSet2.removeAll(hashSet3);
                            if (!hashSet2.isEmpty()) {
                                StringBuilder victor = Q0.c.victor("saveBackStack(\"", str5, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                                if (hashSet2.size() == 1) {
                                    str2 = " " + hashSet2.iterator().next();
                                } else {
                                    str2 = "s " + hashSet2;
                                }
                                victor.append(str2);
                                victor.append(" in ");
                                victor.append(c0606a4);
                                victor.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                                l11.white(new IllegalArgumentException(victor.toString()));
                                throw th3;
                            }
                            i11 = i14 + 1;
                            th = th3;
                        }
                        Throwable th4 = th;
                        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                        while (!arrayDeque.isEmpty()) {
                            ai aiVar5 = (ai) arrayDeque.removeFirst();
                            if (aiVar5.mRetainInstance) {
                                StringBuilder victor2 = Q0.c.victor("saveBackStack(\"", str5, "\") must not contain retained fragments. Found ");
                                if (hashSet.contains(aiVar5)) {
                                    str = "direct reference to retained ";
                                } else {
                                    str = "retained child ";
                                }
                                victor2.append(str);
                                victor2.append("fragment ");
                                victor2.append(aiVar5);
                                l11.white(new IllegalArgumentException(victor2.toString()));
                                throw th4;
                            }
                            Iterator it6 = aiVar5.mChildFragmentManager.charlie.echo().iterator();
                            while (it6.hasNext()) {
                                ai aiVar6 = (ai) it6.next();
                                if (aiVar6 != null) {
                                    arrayDeque.addLast(aiVar6);
                                }
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it7 = hashSet.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(((ai) it7.next()).mWho);
                        }
                        ArrayList arrayList7 = new ArrayList(l11.delta.size() - beige);
                        for (int i15 = beige; i15 < l11.delta.size(); i15++) {
                            arrayList7.add(th4);
                        }
                        BackStackState backStackState2 = new BackStackState(arrayList6, arrayList7);
                        for (int size = l11.delta.size() - 1; size >= beige; size--) {
                            C0606a c0606a5 = (C0606a) l11.delta.remove(size);
                            C0606a c0606a6 = new C0606a(c0606a5);
                            c0606a6.hotel();
                            arrayList7.set(size - beige, new BackStackRecordState(c0606a6));
                            c0606a5.uniform = true;
                            arrayList.add(c0606a5);
                            arrayList2.add(Boolean.TRUE);
                        }
                        l11.lima.put(str5, backStackState2);
                        return true;
                    }
                }
        }
    }
}
