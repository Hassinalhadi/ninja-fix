package zendesk.classic.messaging;

import android.app.Dialog;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.i;
import androidx.lifecycle.A;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import zendesk.classic.messaging.DialogContent;
import zendesk.classic.messaging.Event;
import zendesk.classic.messaging.components.DateProvider;

@MessagingActivityScope
/* loaded from: classes.dex */
class MessagingDialog implements A {
    private final i appCompatActivity;
    private final DateProvider dateProvider;
    private final MessagingViewModel messagingViewModel;

    /* renamed from: zendesk.classic.messaging.MessagingDialog$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$classic$messaging$DialogContent$Config;

        static {
            int[] iArr = new int[DialogContent.Config.values().length];
            $SwitchMap$zendesk$classic$messaging$DialogContent$Config = iArr;
            try {
                iArr[DialogContent.Config.TRANSCRIPT_PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$DialogContent$Config[DialogContent.Config.TRANSCRIPT_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MessagingDialog(i iVar, MessagingViewModel messagingViewModel, DateProvider dateProvider) {
        this.appCompatActivity = iVar;
        this.messagingViewModel = messagingViewModel;
        this.dateProvider = dateProvider;
    }

    @Override // androidx.lifecycle.A
    public void onChanged(final DialogContent dialogContent) {
        if (dialogContent != null) {
            final Dialog dialog = new Dialog(this.appCompatActivity);
            dialog.setContentView(R.layout.zui_messaging_dialog);
            TextView textView = (TextView) dialog.findViewById(R.id.zui_dialog_title);
            TextView textView2 = (TextView) dialog.findViewById(R.id.zui_dialog_message);
            Button button = (Button) dialog.findViewById(R.id.zui_dialog_positive_button);
            Button button2 = (Button) dialog.findViewById(R.id.zui_dialog_negative_button);
            final TextInputEditText textInputEditText = (TextInputEditText) dialog.findViewById(R.id.zui_dialog_input);
            final TextInputLayout textInputLayout = (TextInputLayout) dialog.findViewById(R.id.zui_dialog_input_layout);
            button2.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.MessagingDialog.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dialog.dismiss();
                    MessagingDialog.this.messagingViewModel.onEvent(new Event.DialogItemClicked.Builder(MessagingDialog.this.dateProvider.now(), dialogContent.getConfig(), false).build());
                }
            });
            dialog.setTitle(dialogContent.getTitle());
            textView2.setText(dialogContent.getMessage());
            textView.setText(dialogContent.getTitle());
            button2.setText(R.string.zui_button_label_no);
            button.setText(R.string.zui_button_label_yes);
            int i4 = AnonymousClass4.$SwitchMap$zendesk$classic$messaging$DialogContent$Config[dialogContent.getConfig().ordinal()];
            if (i4 == 1) {
                button.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.MessagingDialog.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        MessagingDialog.this.messagingViewModel.onEvent(new Event.DialogItemClicked.Builder(MessagingDialog.this.dateProvider.now(), dialogContent.getConfig(), true).build());
                        dialog.dismiss();
                    }
                });
            } else if (i4 == 2) {
                textInputLayout.setVisibility(0);
                button2.setText(android.R.string.cancel);
                button.setText(R.string.zui_label_send);
                textInputLayout.setHint(this.appCompatActivity.getString(R.string.zui_dialog_email_hint));
                button.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.MessagingDialog.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Editable text = textInputEditText.getText();
                        if (text != null && Patterns.EMAIL_ADDRESS.matcher(text.toString()).matches()) {
                            MessagingDialog.this.messagingViewModel.onEvent(new Event.DialogItemClicked.Builder(MessagingDialog.this.dateProvider.now(), dialogContent.getConfig(), true).setPayload(textInputEditText.getText().toString()).setPreviousConfig(dialogContent.previousConfig()).build());
                            dialog.dismiss();
                        } else {
                            textInputLayout.setError(MessagingDialog.this.appCompatActivity.getString(R.string.zui_dialog_email_error));
                        }
                    }
                });
            }
            dialog.show();
        }
    }
}
