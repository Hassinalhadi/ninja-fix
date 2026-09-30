package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0606a extends V implements H {
    public final L romeo;
    public boolean sierra;
    public int tango;
    public boolean uniform;

    public C0606a(L l10) {
        l10.emerald();
        as asVar = l10.xray;
        if (asVar != null) {
            asVar.purple.getClassLoader();
        }
        this.tango = -1;
        this.uniform = false;
        this.romeo = l10;
    }

    @Override // androidx.fragment.app.H
    public final boolean alpha(ArrayList arrayList, ArrayList arrayList2) {
        if (L.gray(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.golf) {
            this.romeo.delta.add(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.V
    public final void delta(int i4, ai aiVar, String str, int i5) {
        String str2 = aiVar.mPreviousWho;
        if (str2 != null) {
            O1.c.charlie(aiVar, str2);
        }
        Class<?> cls = aiVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = aiVar.mTag;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + aiVar + ": was " + aiVar.mTag + " now " + str);
                }
                aiVar.mTag = str;
            }
            if (i4 != 0) {
                if (i4 != -1) {
                    int i10 = aiVar.mFragmentId;
                    if (i10 != 0 && i10 != i4) {
                        throw new IllegalStateException("Can't change container ID of fragment " + aiVar + ": was " + aiVar.mFragmentId + " now " + i4);
                    }
                    aiVar.mFragmentId = i4;
                    aiVar.mContainerId = i4;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + aiVar + " with tag " + str + " to container view with no id");
                }
            }
            bravo(new U(aiVar, i5));
            aiVar.mFragmentManager = this.romeo;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.U, java.lang.Object] */
    @Override // androidx.fragment.app.V
    public final C0606a foxtrot(ai aiVar, androidx.lifecycle.ab abVar) {
        L l10 = aiVar.mFragmentManager;
        L l11 = this.romeo;
        if (l10 == l11) {
            if (abVar == androidx.lifecycle.ab.purple && aiVar.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + abVar + " after the Fragment has been created");
            }
            if (abVar != androidx.lifecycle.ab.alpha) {
                ?? obj = new Object();
                obj.alpha = 10;
                obj.bravo = aiVar;
                obj.charlie = false;
                obj.hotel = aiVar.mMaxState;
                obj.india = abVar;
                bravo(obj);
                return this;
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + abVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + l11);
    }

    public final void golf(int i4) {
        if (this.golf) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
            }
            ArrayList arrayList = this.alpha;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                U u4 = (U) arrayList.get(i5);
                ai aiVar = u4.bravo;
                if (aiVar != null) {
                    aiVar.mBackStackNesting += i4;
                    if (L.gray(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + u4.bravo + " to " + u4.bravo.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void hotel() {
        ArrayList arrayList = this.alpha;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            U u4 = (U) arrayList.get(size);
            if (u4.charlie) {
                if (u4.alpha == 8) {
                    u4.charlie = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i4 = u4.bravo.mContainerId;
                    u4.alpha = 2;
                    u4.charlie = false;
                    for (int i5 = size - 1; i5 >= 0; i5--) {
                        U u10 = (U) arrayList.get(i5);
                        if (u10.charlie && u10.bravo.mContainerId == i4) {
                            arrayList.remove(i5);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int india() {
        return juliet(false, true);
    }

    public final int juliet(boolean z2, boolean z10) {
        if (!this.sierra) {
            if (L.gray(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new f0());
                kilo("  ", printWriter, true);
                printWriter.close();
            }
            this.sierra = true;
            boolean z11 = this.golf;
            L l10 = this.romeo;
            if (z11) {
                this.tango = l10.kilo.getAndIncrement();
            } else {
                this.tango = -1;
            }
            if (z10) {
                l10.xray(this, z2);
            }
            return this.tango;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void kilo(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.india);
            printWriter.print(" mIndex=");
            printWriter.print(this.tango);
            printWriter.print(" mCommitted=");
            printWriter.println(this.sierra);
            if (this.foxtrot != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.foxtrot));
            }
            if (this.bravo != 0 || this.charlie != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.bravo));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.charlie));
            }
            if (this.delta != 0 || this.echo != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.delta));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.echo));
            }
            if (this.juliet != 0 || this.kilo != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.juliet));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.kilo);
            }
            if (this.lima != 0 || this.mike != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.lima));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mike);
            }
        }
        ArrayList arrayList = this.alpha;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                U u4 = (U) arrayList.get(i4);
                switch (u4.alpha) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + u4.alpha;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(u4.bravo);
                if (z2) {
                    if (u4.delta != 0 || u4.echo != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(u4.delta));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(u4.echo));
                    }
                    if (u4.foxtrot != 0 || u4.golf != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(u4.foxtrot));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(u4.golf));
                    }
                }
            }
        }
    }

    public final C0606a lima(ai aiVar) {
        L l10 = aiVar.mFragmentManager;
        if (l10 != null && l10 != this.romeo) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + aiVar.toString() + " is already attached to a FragmentManager.");
        }
        bravo(new U(aiVar, 4));
        return this;
    }

    public final C0606a mike(ai aiVar) {
        L l10 = aiVar.mFragmentManager;
        if (l10 != null && l10 != this.romeo) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + aiVar.toString() + " is already attached to a FragmentManager.");
        }
        bravo(new U(aiVar, 3));
        return this;
    }

    public final C0606a november(ai aiVar) {
        L l10 = aiVar.mFragmentManager;
        if (l10 != null && l10 != this.romeo) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + aiVar.toString() + " is already attached to a FragmentManager.");
        }
        bravo(new U(aiVar, 8));
        return this;
    }

    public final C0606a oscar(ai aiVar) {
        L l10 = aiVar.mFragmentManager;
        if (l10 != null && l10 != this.romeo) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + aiVar.toString() + " is already attached to a FragmentManager.");
        }
        bravo(new U(aiVar, 5));
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.tango >= 0) {
            sb2.append(" #");
            sb2.append(this.tango);
        }
        if (this.india != null) {
            sb2.append(" ");
            sb2.append(this.india);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.fragment.app.U, java.lang.Object] */
    public C0606a(C0606a c0606a) {
        c0606a.romeo.emerald();
        as asVar = c0606a.romeo.xray;
        if (asVar != null) {
            asVar.purple.getClassLoader();
        }
        Iterator it = c0606a.alpha.iterator();
        while (it.hasNext()) {
            U u4 = (U) it.next();
            ArrayList arrayList = this.alpha;
            ?? obj = new Object();
            obj.alpha = u4.alpha;
            obj.bravo = u4.bravo;
            obj.charlie = u4.charlie;
            obj.delta = u4.delta;
            obj.echo = u4.echo;
            obj.foxtrot = u4.foxtrot;
            obj.golf = u4.golf;
            obj.hotel = u4.hotel;
            obj.india = u4.india;
            arrayList.add(obj);
        }
        this.bravo = c0606a.bravo;
        this.charlie = c0606a.charlie;
        this.delta = c0606a.delta;
        this.echo = c0606a.echo;
        this.foxtrot = c0606a.foxtrot;
        this.golf = c0606a.golf;
        this.hotel = c0606a.hotel;
        this.india = c0606a.india;
        this.lima = c0606a.lima;
        this.mike = c0606a.mike;
        this.juliet = c0606a.juliet;
        this.kilo = c0606a.kilo;
        if (c0606a.november != null) {
            ArrayList arrayList2 = new ArrayList();
            this.november = arrayList2;
            arrayList2.addAll(c0606a.november);
        }
        if (c0606a.oscar != null) {
            ArrayList arrayList3 = new ArrayList();
            this.oscar = arrayList3;
            arrayList3.addAll(c0606a.oscar);
        }
        this.papa = c0606a.papa;
        this.tango = -1;
        this.uniform = false;
        this.romeo = c0606a.romeo;
        this.sierra = c0606a.sierra;
        this.tango = c0606a.tango;
        this.uniform = c0606a.uniform;
    }
}
