package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class t extends m {
    public final int echo;
    public EditText foxtrot;
    public final com.clevertap.android.sdk.inapp.fragment.a golf;

    public t(l lVar, int i4) {
        super(lVar);
        this.echo = R.drawable.design_password_eye;
        this.golf = new com.clevertap.android.sdk.inapp.fragment.a(6, this);
        if (i4 != 0) {
            this.echo = i4;
        }
    }

    @Override // com.google.android.material.textfield.m
    public final void bravo() {
        quebec();
    }

    @Override // com.google.android.material.textfield.m
    public final int charlie() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.m
    public final int delta() {
        return this.echo;
    }

    @Override // com.google.android.material.textfield.m
    public final View.OnClickListener foxtrot() {
        return this.golf;
    }

    @Override // com.google.android.material.textfield.m
    public final boolean kilo() {
        return true;
    }

    @Override // com.google.android.material.textfield.m
    public final boolean lima() {
        boolean z2;
        EditText editText = this.foxtrot;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return !z2;
    }

    @Override // com.google.android.material.textfield.m
    public final void mike(EditText editText) {
        this.foxtrot = editText;
        quebec();
    }

    @Override // com.google.android.material.textfield.m
    public final void romeo() {
        EditText editText = this.foxtrot;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.foxtrot.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.m
    public final void sierra() {
        EditText editText = this.foxtrot;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
