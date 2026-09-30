package Je;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends Ke.a {
    public static final a foxtrot = new a(1, 0, 7);

    static {
        new a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.echo(numbers, "numbers");
    }
}
