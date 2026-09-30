package androidx.compose.ui.tooling;

import P.d;
import P0.b;
import P0.c;
import Wd.a;
import ae.o;
import af.AbstractC0434e;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Lae/o;", "<init>", "()V", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewActivity extends o {
    public final String alpha = "PreviewActivity";

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        r5 = null;
     */
    @Override // ae.o, f1.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        int i4 = getApplicationInfo().flags & 2;
        String str = this.alpha;
        if (i4 == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("composable")) != null) {
            Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
            String white = StringsKt.white(stringExtra, '.');
            String purple = StringsKt.purple('.', stringExtra, stringExtra);
            String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
            if (stringExtra2 != null) {
                Log.d(str, "Previewing '" + purple + "' with parameter provider: '" + stringExtra2 + '\'');
                try {
                    cls = Class.forName(stringExtra2);
                } catch (ClassNotFoundException e) {
                    Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e);
                    cls = null;
                }
                getIntent().getIntExtra("parameterProviderIndex", -1);
                int i5 = 0;
                if (cls != null) {
                    try {
                        Constructor<?>[] constructors = cls.getConstructors();
                        int length = constructors.length;
                        Constructor<?> constructor = null;
                        boolean z2 = false;
                        while (true) {
                            if (i5 < length) {
                                Constructor<?> constructor2 = constructors[i5];
                                if (constructor2.getParameterTypes().length == 0) {
                                    if (z2) {
                                        break;
                                    }
                                    z2 = true;
                                    constructor = constructor2;
                                }
                                i5++;
                            } else if (!z2) {
                            }
                        }
                        if (constructor != null) {
                            constructor.setAccessible(true);
                            Intrinsics.charlie(constructor.newInstance(null), "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
                            throw new ClassCastException();
                        }
                        throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
                    } catch (a unused) {
                        throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
                    }
                }
                AbstractC0434e.alpha(this, new d(new c(white, purple, new Object[0], 0), -1901447514, true));
                return;
            }
            Log.d(str, "Previewing '" + purple + "' without a parameter provider.");
            AbstractC0434e.alpha(this, new d(new b(0, white, purple), -840626948, true));
        }
    }
}
