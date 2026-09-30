package kotlin.reflect.jvm.internal.impl.types;

import com.clevertap.android.sdk.Constants;
import gf.C1791f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class at extends as {
    public final int alpha;
    public final y bravo;

    public at(int i4, y yVar) {
        if (i4 == 0) {
            echo(0);
            throw null;
        }
        if (yVar != null) {
            this.alpha = i4;
            this.bravo = yVar;
        } else {
            echo(1);
            throw null;
        }
    }

    public static /* synthetic */ void echo(int i4) {
        String str = (i4 == 4 || i4 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i4 == 4 || i4 == 5) ? 2 : 3];
        switch (i4) {
            case 1:
            case 2:
            case 3:
                objArr[0] = Constants.KEY_TYPE;
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i4 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i4 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i4 == 3) {
            objArr[2] = "replaceType";
        } else if (i4 != 4 && i4 != 5) {
            if (i4 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i4 != 4 && i4 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.as
    public final int alpha() {
        int i4 = this.alpha;
        if (i4 != 0) {
            return i4;
        }
        echo(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.as
    public final y bravo() {
        y yVar = this.bravo;
        if (yVar != null) {
            return yVar;
        }
        echo(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.as
    public final boolean charlie() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.as
    public final as delta(C1791f c1791f) {
        if (c1791f != null) {
            y type = this.bravo;
            Intrinsics.echo(type, "type");
            return new at(this.alpha, type);
        }
        echo(6);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public at(y yVar) {
        this(1, yVar);
        if (yVar != null) {
        } else {
            echo(2);
            throw null;
        }
    }
}
