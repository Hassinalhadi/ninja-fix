package Uf;

import Tf.ak;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Xd.l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ Ref.ObjectRef purple;
    public final /* synthetic */ ak red;
    public final /* synthetic */ Ref.ObjectRef silver;
    public final /* synthetic */ Ref.ObjectRef teal;

    public /* synthetic */ k(ak akVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.red = akVar;
        this.purple = objectRef;
        this.silver = objectRef2;
        this.teal = objectRef3;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        int i4 = this.alpha;
        int intValue = ((Integer) obj).intValue();
        Long l10 = (Long) obj2;
        switch (i4) {
            case 0:
                long longValue = l10.longValue();
                if (intValue == 21589) {
                    long j5 = 1;
                    if (longValue >= 1) {
                        ak akVar = this.red;
                        byte readByte = akVar.readByte();
                        boolean z11 = true;
                        if ((readByte & 1) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((readByte & 2) == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((readByte & 4) != 4) {
                            z11 = false;
                        }
                        if (z2) {
                            j5 = 5;
                        }
                        if (z10) {
                            j5 += 4;
                        }
                        if (z11) {
                            j5 += 4;
                        }
                        if (longValue >= j5) {
                            if (z2) {
                                this.purple.alpha = Integer.valueOf(akVar.echo());
                            }
                            if (z10) {
                                this.silver.alpha = Integer.valueOf(akVar.echo());
                            }
                            if (z11) {
                                this.teal.alpha = Integer.valueOf(akVar.echo());
                            }
                        } else {
                            throw new IOException("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                }
                return Unit.INSTANCE;
            default:
                long longValue2 = l10.longValue();
                if (intValue == 1) {
                    Ref.ObjectRef objectRef = this.purple;
                    if (objectRef.alpha == null) {
                        if (longValue2 == 24) {
                            ak akVar2 = this.red;
                            objectRef.alpha = Long.valueOf(akVar2.foxtrot());
                            this.silver.alpha = Long.valueOf(akVar2.foxtrot());
                            this.teal.alpha = Long.valueOf(akVar2.foxtrot());
                        } else {
                            throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        }
                    } else {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(Ref.ObjectRef objectRef, ak akVar, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.purple = objectRef;
        this.red = akVar;
        this.silver = objectRef2;
        this.teal = objectRef3;
    }
}
