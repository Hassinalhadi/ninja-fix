package zendesk.support.request;

import android.view.View;
import zendesk.support.request.ComponentInputForm;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ a(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.alpha) {
            case 0:
                ComponentInputForm.alpha((ComponentInputForm.InputFormModel) this.purple, view);
                return;
            default:
                RequestActivity.foxtrot((RequestActivity) this.purple, view);
                return;
        }
    }
}
