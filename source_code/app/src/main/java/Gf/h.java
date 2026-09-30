package Gf;

import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;

/* loaded from: classes2.dex */
public abstract class h {
    public static final g alpha = new g(new byte[0], 0, 0, null);
    public static final int bravo;
    public static final int charlie;
    public static final int delta;
    public static final int echo;
    public static final AtomicReferenceArray foxtrot;
    public static final AtomicReferenceArray golf;

    static {
        String str;
        int intValue;
        int i4 = 0;
        int i5 = 1;
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        bravo = highestOneBit;
        int i10 = highestOneBit / 2;
        if (i10 >= 1) {
            i5 = i10;
        }
        charlie = i5;
        if (Intrinsics.areEqual(System.getProperty("java.vm.name"), "Dalvik")) {
            str = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        } else {
            str = "4194304";
        }
        String property = System.getProperty("kotlinx.io.pool.size.bytes", str);
        Intrinsics.delta(property, "getProperty(...)");
        Integer tango = r.tango(property);
        if (tango != null && (intValue = tango.intValue()) >= 0) {
            i4 = intValue;
        }
        delta = i4;
        int i11 = i4 / i5;
        if (i11 < 8192) {
            i11 = 8192;
        }
        echo = i11;
        foxtrot = new AtomicReferenceArray(highestOneBit);
        golf = new AtomicReferenceArray(i5);
    }

    public static final void alpha(g segment) {
        int i4;
        int i5;
        Intrinsics.echo(segment, "segment");
        if (segment.foxtrot == null && segment.golf == null) {
            k kVar = segment.delta;
            if (kVar != null) {
                f fVar = (f) kVar;
                if (fVar.bravo != 0) {
                    int decrementAndGet = f.charlie.decrementAndGet(fVar);
                    if (decrementAndGet < 0) {
                        if (decrementAndGet == -1) {
                            fVar.bravo = 0;
                        } else {
                            throw new IllegalStateException(("Shared copies count is negative: " + (decrementAndGet + 1)).toString());
                        }
                    } else {
                        return;
                    }
                }
            }
            AtomicReferenceArray atomicReferenceArray = foxtrot;
            int id2 = (int) ((bravo - 1) & Thread.currentThread().getId());
            segment.bravo = 0;
            segment.echo = true;
            while (true) {
                g gVar = (g) atomicReferenceArray.get(id2);
                g gVar2 = alpha;
                if (gVar != gVar2) {
                    if (gVar != null) {
                        i4 = gVar.charlie;
                    } else {
                        i4 = 0;
                    }
                    if (i4 >= 65536) {
                        if (delta > 0) {
                            segment.bravo = 0;
                            segment.echo = true;
                            int id3 = (int) ((charlie - 1) & Thread.currentThread().getId());
                            AtomicReferenceArray atomicReferenceArray2 = golf;
                            int i10 = 0;
                            while (true) {
                                g gVar3 = (g) atomicReferenceArray2.get(id3);
                                if (gVar3 != gVar2) {
                                    if (gVar3 != null) {
                                        i5 = gVar3.charlie;
                                    } else {
                                        i5 = 0;
                                    }
                                    int i11 = i5 + 8192;
                                    if (i11 > echo) {
                                        int i12 = charlie;
                                        if (i10 < i12) {
                                            i10++;
                                            id3 = (id3 + 1) & (i12 - 1);
                                        } else {
                                            return;
                                        }
                                    } else {
                                        segment.foxtrot = gVar3;
                                        segment.charlie = i11;
                                        while (!atomicReferenceArray2.compareAndSet(id3, gVar3, segment)) {
                                            if (atomicReferenceArray2.get(id3) != gVar3) {
                                                break;
                                            }
                                        }
                                        return;
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        segment.foxtrot = gVar;
                        segment.charlie = i4 + 8192;
                        while (!atomicReferenceArray.compareAndSet(id2, gVar, segment)) {
                            if (atomicReferenceArray.get(id2) != gVar) {
                                break;
                            }
                        }
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static final g bravo() {
        g gVar;
        g gVar2;
        AtomicReferenceArray atomicReferenceArray = foxtrot;
        int id2 = (int) ((bravo - 1) & Thread.currentThread().getId());
        do {
            gVar = alpha;
            gVar2 = (g) atomicReferenceArray.getAndSet(id2, gVar);
        } while (Intrinsics.areEqual(gVar2, gVar));
        if (gVar2 == null) {
            atomicReferenceArray.set(id2, null);
            if (delta > 0) {
                AtomicReferenceArray atomicReferenceArray2 = golf;
                int i4 = charlie;
                int id3 = (int) (Thread.currentThread().getId() & (i4 - 1));
                int i5 = 0;
                while (true) {
                    g gVar3 = (g) atomicReferenceArray2.getAndSet(id3, gVar);
                    if (!Intrinsics.areEqual(gVar3, gVar)) {
                        if (gVar3 == null) {
                            atomicReferenceArray2.set(id3, null);
                            if (i5 < i4) {
                                id3 = (id3 + 1) & (i4 - 1);
                                i5++;
                            } else {
                                return new g();
                            }
                        } else {
                            atomicReferenceArray2.set(id3, gVar3.foxtrot);
                            gVar3.foxtrot = null;
                            gVar3.charlie = 0;
                            return gVar3;
                        }
                    }
                }
            } else {
                return new g();
            }
        } else {
            atomicReferenceArray.set(id2, gVar2.foxtrot);
            gVar2.foxtrot = null;
            gVar2.charlie = 0;
            return gVar2;
        }
    }
}
