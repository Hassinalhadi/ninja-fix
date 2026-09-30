package Cb;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.CTExecutors;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class ab implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;

    public /* synthetic */ ab(int i4, int i5) {
        this.alpha = i5;
        this.purple = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CTExecutors executorResourceDownloader$lambda$4;
        switch (this.alpha) {
            case 0:
                Context context = (Context) obj;
                Intrinsics.echo(context, "context");
                FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
                fragmentContainerView.setId(this.purple);
                fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return fragmentContainerView;
            case 1:
                executorResourceDownloader$lambda$4 = CTExecutorFactory.executorResourceDownloader$lambda$4(this.purple, (String) obj);
                return executorResourceDownloader$lambda$4;
            default:
                Context context2 = (Context) obj;
                Intrinsics.echo(context2, "context");
                TextView textView = new TextView(context2);
                textView.setTextIsSelectable(false);
                textView.setBackgroundColor(0);
                textView.setMaxLines(this.purple);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                return textView;
        }
    }
}
