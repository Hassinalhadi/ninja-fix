package Af;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater echo = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater foxtrot = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");
    public static final t golf = new t("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int alpha;
    public final boolean bravo;
    public final int charlie;
    public final /* synthetic */ AtomicReferenceArray delta;

    public m(int i4, boolean z2) {
        this.alpha = i4;
        this.bravo = z2;
        int i5 = i4 - 1;
        this.charlie = i5;
        this.delta = new AtomicReferenceArray(i4);
        if (i5 <= 1073741823) {
            if ((i4 & i5) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int alpha(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = foxtrot;
            long j5 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j5) != 0) {
                if ((2305843009213693952L & j5) != 0) {
                    return 2;
                }
                return 1;
            }
            int i4 = (int) (1073741823 & j5);
            int i5 = (int) ((1152921503533105152L & j5) >> 30);
            int i10 = this.charlie;
            if (((i5 + 2) & i10) != (i4 & i10)) {
                AtomicReferenceArray atomicReferenceArray = this.delta;
                if (!this.bravo && atomicReferenceArray.get(i5 & i10) != null) {
                    int i11 = this.alpha;
                    if (i11 < 1024 || ((i5 - i4) & 1073741823) > (i11 >> 1)) {
                        return 1;
                    }
                } else if (atomicLongFieldUpdater.compareAndSet(this, j5, ((-1152921503533105153L) & j5) | (((i5 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i5 & i10, runnable);
                    m mVar = this;
                    while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                        mVar = mVar.charlie();
                        AtomicReferenceArray atomicReferenceArray2 = mVar.delta;
                        int i12 = mVar.charlie & i5;
                        Object obj = atomicReferenceArray2.get(i12);
                        if ((obj instanceof l) && ((l) obj).alpha == i5) {
                            atomicReferenceArray2.set(i12, runnable);
                        } else {
                            mVar = null;
                        }
                        if (mVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean bravo() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        do {
            atomicLongFieldUpdater = foxtrot;
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j5) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, 2305843009213693952L | j5));
        return true;
    }

    public final m charlie() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = foxtrot;
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j6 = 1152921504606846976L | j5;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j5, j6)) {
                j5 = j6;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = echo;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.alpha * 2, mVar.bravo);
            int i4 = (int) (1073741823 & j5);
            int i5 = (int) ((1152921503533105152L & j5) >> 30);
            while (true) {
                int i10 = mVar.charlie;
                int i11 = i4 & i10;
                if (i11 == (i10 & i5)) {
                    break;
                }
                Object obj = mVar.delta.get(i11);
                if (obj == null) {
                    obj = new l(i4);
                }
                mVar3.delta.set(mVar3.charlie & i4, obj);
                i4++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j5);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object delta() {
        m mVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = foxtrot;
            long j5 = atomicLongFieldUpdater.get(mVar);
            if ((j5 & 1152921504606846976L) != 0) {
                return golf;
            }
            int i4 = (int) (j5 & 1073741823);
            int i5 = mVar.charlie;
            int i10 = ((int) ((1152921503533105152L & j5) >> 30)) & i5;
            int i11 = i5 & i4;
            if (i10 == i11) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVar.delta;
            Object obj = atomicReferenceArray.get(i11);
            boolean z2 = mVar.bravo;
            if (obj == null) {
                if (z2) {
                    break;
                }
            } else {
                if (obj instanceof l) {
                    break;
                }
                long j6 = (i4 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(mVar, j5, (j5 & (-1073741824)) | j6)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                mVar = this;
                if (z2) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = foxtrot;
                        long j7 = atomicLongFieldUpdater2.get(mVar);
                        int i12 = (int) (j7 & 1073741823);
                        if ((j7 & 1152921504606846976L) != 0) {
                            mVar = mVar.charlie();
                        } else {
                            m mVar2 = mVar;
                            mVar = mVar2;
                            if (atomicLongFieldUpdater2.compareAndSet(mVar2, j7, (j7 & (-1073741824)) | j6)) {
                                mVar.delta.set(mVar.charlie & i12, null);
                                mVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (mVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
