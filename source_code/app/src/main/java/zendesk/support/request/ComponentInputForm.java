package zendesk.support.request;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.List;
import r1.AbstractC2484c;
import zendesk.support.R;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

/* loaded from: classes.dex */
public class ComponentInputForm implements Listener<InputFormModel>, RequestViewConversationsDisabled.MenuItemsDelegate {
    private final ActionFactory actionFactory;
    private final AttachmentHelper attachmentHelper;
    private final Dispatcher dispatcher;
    private final EditText emailField;
    private final TextInputLayout emailLayout;
    private final Validator<String> emailValidator;
    private boolean inlineValidation = false;
    private final View logo;
    private final EditText messageField;
    private final TextInputLayout messageLayout;
    private final EditText nameField;
    private final TextInputLayout nameLayout;
    private MenuItem sendButton;

    /* renamed from: zendesk.support.request.ComponentInputForm$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Validator<String> {
        @Override // zendesk.support.request.ComponentInputForm.Validator
        public boolean isValid(String str) {
            return AbstractC2484c.alpha.matcher(str).matches();
        }
    }

    /* loaded from: classes.dex */
    public static class EditTextTextWatcher implements TextWatcher {
        private final ComponentInputForm componentInputForm;

        private EditTextTextWatcher(ComponentInputForm componentInputForm) {
            this.componentInputForm = componentInputForm;
        }

        public static void install(ComponentInputForm componentInputForm, EditText... editTextArr) {
            for (EditText editText : editTextArr) {
                editText.addTextChangedListener(new EditTextTextWatcher(componentInputForm));
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
            if (this.componentInputForm.inlineValidation) {
                this.componentInputForm.updateEmailValidation();
            }
            this.componentInputForm.updateSendButton();
        }
    }

    /* loaded from: classes.dex */
    public static class EmailFieldFocusListener implements View.OnFocusChangeListener {
        private final ComponentInputForm componentInputForm;
        private final EditText editText;

        private EmailFieldFocusListener(ComponentInputForm componentInputForm, EditText editText) {
            this.componentInputForm = componentInputForm;
            this.editText = editText;
        }

        public static void install(ComponentInputForm componentInputForm, EditText editText) {
            editText.setOnFocusChangeListener(new EmailFieldFocusListener(componentInputForm, editText));
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            if (!z2 && StringUtils.hasLength(this.editText.getText().toString())) {
                this.componentInputForm.updateEmailValidation();
                this.componentInputForm.updateSendButton();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class InputFormModel {
        private final boolean hasIdentityEmailAddress;
        private final boolean hasIdentityName;
        private final boolean isLoading;
        private final boolean neverRequestEmail;
        private final String referrerUrl;
        private final boolean showZendeskLogo;

        public InputFormModel(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, String str) {
            this.neverRequestEmail = z2;
            this.hasIdentityEmailAddress = z10;
            this.hasIdentityName = z11;
            this.isLoading = z12;
            this.showZendeskLogo = z13;
            this.referrerUrl = str;
        }

        private boolean isEmailFieldEnabled() {
            if (!this.hasIdentityEmailAddress && !this.neverRequestEmail) {
                return true;
            }
            return false;
        }

        private boolean isNameFieldEnabled() {
            return !this.hasIdentityName;
        }

        public int getEmailFieldVisibility() {
            if (isEmailFieldEnabled()) {
                return 0;
            }
            return 8;
        }

        public int getLogoVisibility() {
            if (isLogoEnabled()) {
                return 0;
            }
            return 8;
        }

        public int getMessageFieldVisibility() {
            return 0;
        }

        public int getNameFieldVisibility() {
            if (isNameFieldEnabled()) {
                return 0;
            }
            return 8;
        }

        public String getReferrerUrl() {
            return this.referrerUrl;
        }

        public boolean isLoading() {
            return this.isLoading;
        }

        public boolean isLogoEnabled() {
            return this.showZendeskLogo;
        }
    }

    /* loaded from: classes.dex */
    public static class InputFormSelector implements StateSelector<InputFormModel> {
        @Override // zendesk.support.suas.StateSelector
        public InputFormModel selectData(State state) {
            StateSettings settings = StateConfig.fromState(state).getSettings();
            return new InputFormModel(settings.isNeverRequestEmailOn(), settings.hasIdentityEmailAddress(), settings.hasIdentityName(), StateProgress.fomState(state).getRunningRequests() > 0, settings.isShowZendeskLogo(), settings.getReferrerUrl());
        }
    }

    /* loaded from: classes.dex */
    public interface Validator<T> {
        boolean isValid(T t5);
    }

    public ComponentInputForm(View view, EditText editText, TextInputLayout textInputLayout, EditText editText2, TextInputLayout textInputLayout2, Validator<String> validator, EditText editText3, TextInputLayout textInputLayout3, Dispatcher dispatcher, ActionFactory actionFactory, AttachmentHelper attachmentHelper) {
        this.logo = view;
        this.nameField = editText;
        this.emailField = editText2;
        this.messageField = editText3;
        this.nameLayout = textInputLayout;
        this.emailLayout = textInputLayout2;
        this.messageLayout = textInputLayout3;
        this.emailValidator = validator;
        this.dispatcher = dispatcher;
        this.actionFactory = actionFactory;
        this.attachmentHelper = attachmentHelper;
        EditTextTextWatcher.install(this, editText, editText2, editText3);
        EmailFieldFocusListener.install(this, editText2);
    }

    public static ComponentInputForm create(View view, Dispatcher dispatcher, ActionFactory actionFactory, AttachmentHelper attachmentHelper) {
        AnonymousClass1 anonymousClass1 = new Validator<String>() { // from class: zendesk.support.request.ComponentInputForm.1
            @Override // zendesk.support.request.ComponentInputForm.Validator
            public boolean isValid(String str) {
                return AbstractC2484c.alpha.matcher(str).matches();
            }
        };
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.request_name_layout);
        EditText editText = (EditText) view.findViewById(R.id.request_name_field);
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(R.id.request_email_layout);
        EditText editText2 = (EditText) view.findViewById(R.id.request_email_field);
        TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(R.id.request_message_layout);
        return new ComponentInputForm(view.findViewById(R.id.request_zendesk_logo), editText, textInputLayout, editText2, textInputLayout2, anonymousClass1, (EditText) view.findViewById(R.id.request_message_field), textInputLayout3, dispatcher, actionFactory, attachmentHelper);
    }

    private boolean doFieldsContainText() {
        boolean z2;
        boolean z10;
        String obj = this.nameField.getText().toString();
        String obj2 = this.emailField.getText().toString();
        String obj3 = this.messageField.getText().toString();
        if (isNameFieldVisible() && !StringUtils.hasLength(obj)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (isEmailFieldVisible() && !StringUtils.hasLength(obj2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean hasLength = StringUtils.hasLength(obj3);
        if (z2 && z10 && hasLength) {
            return true;
        }
        return false;
    }

    private static View.OnClickListener getLogoOnClickListener(InputFormModel inputFormModel) {
        if (inputFormModel.isLogoEnabled() && StringUtils.hasLength(inputFormModel.getReferrerUrl())) {
            return new a(0, inputFormModel);
        }
        return null;
    }

    private boolean isEmailFieldVisible() {
        if (this.emailLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private boolean isEmailInputValid() {
        boolean isEmailFieldVisible = isEmailFieldVisible();
        String obj = this.emailField.getText().toString();
        if (isEmailFieldVisible && !this.emailValidator.isValid(obj)) {
            return false;
        }
        return true;
    }

    private boolean isNameFieldVisible() {
        if (this.nameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void lambda$getLogoOnClickListener$0(InputFormModel inputFormModel, View view) {
        view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(inputFormModel.getReferrerUrl())));
    }

    private void setSendButtonEnabled(boolean z2) {
        if (this.sendButton != null) {
            int i4 = 255;
            if (!z2) {
                i4 = (this.messageLayout.getContext().getResources().getInteger(R.integer.zs_request_menu_send_btn_alpha_inactive) * 255) / 100;
            }
            this.sendButton.getIcon().setAlpha(i4);
            this.sendButton.setEnabled(z2);
        }
    }

    public void updateEmailValidation() {
        if (isEmailInputValid()) {
            this.emailLayout.setError(null);
        } else {
            this.inlineValidation = true;
            this.emailLayout.setError(this.emailField.getContext().getString(R.string.error_msg_invalid_email));
        }
    }

    public void updateSendButton() {
        boolean doFieldsContainText;
        if (this.inlineValidation) {
            if (doFieldsContainText() && isEmailInputValid()) {
                doFieldsContainText = true;
            } else {
                doFieldsContainText = false;
            }
        } else {
            doFieldsContainText = doFieldsContainText();
        }
        setSendButtonEnabled(doFieldsContainText);
    }

    public StateSelector<InputFormModel> getSelector() {
        return new InputFormSelector();
    }

    public boolean hasUnsavedInput() {
        String obj = this.nameField.getText().toString();
        String obj2 = this.emailField.getText().toString();
        String obj3 = this.messageField.getText().toString();
        if (this.nameField.isEnabled() && StringUtils.hasLength(obj)) {
            return true;
        }
        if ((this.emailField.isEnabled() && StringUtils.hasLength(obj2)) || StringUtils.hasLength(obj3) || CollectionUtils.isNotEmpty(this.attachmentHelper.getSelectedAttachments())) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.request.RequestViewConversationsDisabled.MenuItemsDelegate
    public void onMenuItemsClicked(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.request_conversations_disabled_menu_ic_send) {
            onSendMessageRequested();
        }
    }

    @Override // zendesk.support.request.RequestViewConversationsDisabled.MenuItemsDelegate
    public void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2) {
        this.sendButton = menuItem;
        updateSendButton();
    }

    public void onSendMessageRequested() {
        if (doFieldsContainText() && isEmailInputValid()) {
            if (isNameFieldVisible() || isEmailFieldVisible()) {
                this.dispatcher.dispatch(this.actionFactory.updateNameEmailAsync(this.nameField.getText().toString(), this.emailField.getText().toString()));
            }
            String obj = this.messageField.getText().toString();
            List<StateRequestAttachment> ensureEmpty = CollectionUtils.ensureEmpty(this.attachmentHelper.getSelectedAttachments());
            this.dispatcher.dispatch(this.actionFactory.clearMessages());
            this.dispatcher.dispatch(this.actionFactory.createCommentAsync(obj, ensureEmpty));
            return;
        }
        updateEmailValidation();
        updateSendButton();
    }

    @Override // zendesk.support.suas.Listener
    public void update(InputFormModel inputFormModel) {
        this.logo.setVisibility(inputFormModel.getLogoVisibility());
        this.nameLayout.setVisibility(inputFormModel.getNameFieldVisibility());
        this.emailLayout.setVisibility(inputFormModel.getEmailFieldVisibility());
        this.messageLayout.setVisibility(inputFormModel.getMessageFieldVisibility());
        this.nameLayout.setEnabled(!inputFormModel.isLoading());
        this.emailLayout.setEnabled(!inputFormModel.isLoading());
        this.messageLayout.setEnabled(!inputFormModel.isLoading());
        if (inputFormModel.isLoading()) {
            setSendButtonEnabled(false);
            return;
        }
        this.logo.setOnClickListener(getLogoOnClickListener(inputFormModel));
        updateSendButton();
    }
}
