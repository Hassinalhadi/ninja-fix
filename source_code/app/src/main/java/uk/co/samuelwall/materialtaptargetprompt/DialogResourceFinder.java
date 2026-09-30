package uk.co.samuelwall.materialtaptargetprompt;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class DialogResourceFinder extends ActivityResourceFinder {
    private final Dialog mDialog;

    public DialogResourceFinder(Dialog dialog) {
        super(dialog.getOwnerActivity());
        this.mDialog = dialog;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ActivityResourceFinder, uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public View findViewById(int i4) {
        return this.mDialog.findViewById(i4);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ActivityResourceFinder, uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public Context getContext() {
        return this.mDialog.getContext();
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ActivityResourceFinder, uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public ViewGroup getPromptParentView() {
        return (ViewGroup) this.mDialog.getWindow().getDecorView();
    }
}
