package zendesk.support.request;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zendesk.util.StringUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import zendesk.support.R;
import zendesk.support.UiUtils;

/* loaded from: classes.dex */
class ViewMessageComposer extends FrameLayout implements View.OnClickListener, View.OnFocusChangeListener, View.OnLayoutChangeListener, TextView.OnEditorActionListener, TextWatcher {
    private static final String LOG_TAG = "ViewMessageComposer";
    private ViewAttachmentsIndicator attachmentsIndicator;
    private AnimatorSet attachmentsOffCollapseAnimatorSet;
    private AnimatorSet attachmentsOffExpandAnimatorSet;
    private AnimatorSet attachmentsOnCollapseAnimatorSet;
    private AnimatorSet attachmentsOnExpandAnimatorSet;
    private List<InputListener> inputListenerList;
    private EditText inputTextField;
    private boolean isAttachmentsButtonDisabled;
    private boolean isSendButtonDisabled;
    private List<View.OnFocusChangeListener> onFocusChangeListenerList;
    private OnHeightChangeListener onHeightChangeListener;
    private ImageView sendButton;
    private MessageComposerStateHelper stateHelper;

    /* loaded from: classes.dex */
    public interface InputListener {
        void onAddAttachmentsRequested();

        void onSendMessageRequested(String str);
    }

    /* loaded from: classes.dex */
    public static class MessageComposerState {
        static final int BUTTON_DISABLED = 11;
        static final int BUTTON_ENABLED = 12;
        static final int BUTTON_HIDDEN = 10;
        static final int FIELD_COLLAPSED = 2;
        static final int FIELD_EXPANDED = 1;
        private final int attachmentButtonState;
        private final int fieldState;
        private final int sendButtonState;

        public MessageComposerState(int i4, int i5, int i10) {
            this.fieldState = i4;
            this.sendButtonState = i5;
            this.attachmentButtonState = i10;
        }

        public int getFieldState() {
            return this.fieldState;
        }

        public int getSendButtonState() {
            return this.sendButtonState;
        }

        public boolean isAttachmentButtonActivated() {
            if (this.attachmentButtonState == 12) {
                return true;
            }
            return false;
        }

        public boolean isAttachmentButtonEnabled() {
            if (this.attachmentButtonState != 10) {
                return true;
            }
            return false;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MessageComposerState{fieldState=");
            sb2.append(this.fieldState);
            sb2.append(", sendButtonState=");
            sb2.append(this.sendButtonState);
            sb2.append(", attachmentButtonEnabled=");
            return Q0.c.quebec(sb2, this.attachmentButtonState, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class MessageComposerStateHelper {
        private boolean hasAttachments(ViewAttachmentsIndicator viewAttachmentsIndicator) {
            if (viewAttachmentsIndicator.getAttachmentsCount() > 0) {
                return true;
            }
            return false;
        }

        private boolean hasLength(String str) {
            if (str != null && str.length() > 0) {
                return true;
            }
            return false;
        }

        private boolean hasValidText(String str) {
            return StringUtils.hasLength(str);
        }

        public int getAttachmentButtonState(boolean z2) {
            return z2 ? 10 : 12;
        }

        public int getFieldState(boolean z2, boolean z10, boolean z11) {
            return (z2 || z10 || z11) ? 1 : 2;
        }

        public int getSendButtonState(boolean z2, boolean z10, boolean z11, int i4) {
            if (z10) {
                return 12;
            }
            if (!z11 || z2) {
                return i4 == 1 ? 11 : 10;
            }
            return 12;
        }

        public MessageComposerState getState(EditText editText, ViewAttachmentsIndicator viewAttachmentsIndicator, boolean z2, boolean z10) {
            String obj = editText.getText().toString();
            boolean hasLength = hasLength(obj);
            boolean hasValidText = hasValidText(obj);
            boolean hasFocus = editText.hasFocus();
            boolean hasAttachments = hasAttachments(viewAttachmentsIndicator);
            int fieldState = getFieldState(hasFocus, hasLength, hasAttachments);
            return new MessageComposerState(fieldState, getSendButtonState(z2, hasValidText, hasAttachments, fieldState), getAttachmentButtonState(z10));
        }

        public MessageComposerState onAttachmentClicked(boolean z2, boolean z10, EditText editText, ViewAttachmentsIndicator viewAttachmentsIndicator) {
            int sendButtonState;
            MessageComposerState state = getState(editText, viewAttachmentsIndicator, true, z10);
            if (state.getSendButtonState() == 10) {
                sendButtonState = 11;
            } else {
                sendButtonState = state.getSendButtonState();
            }
            return new MessageComposerState(1, sendButtonState, getAttachmentButtonState(z10));
        }
    }

    /* loaded from: classes.dex */
    public interface OnHeightChangeListener {
        void onHeightChange(int i4);
    }

    public ViewMessageComposer(Context context) {
        super(context);
        this.onFocusChangeListenerList = new LinkedList();
        this.inputListenerList = new LinkedList();
        this.isSendButtonDisabled = true;
        this.isAttachmentsButtonDisabled = true;
        viewInit(context);
    }

    private void applyState(MessageComposerState messageComposerState) {
        if (messageComposerState.getFieldState() == 1 && !isExpanded()) {
            if (this.isAttachmentsButtonDisabled) {
                this.attachmentsOffExpandAnimatorSet.start();
            } else {
                this.attachmentsOnExpandAnimatorSet.start();
            }
        } else if (messageComposerState.getFieldState() == 2 && isExpanded()) {
            if (this.isAttachmentsButtonDisabled) {
                this.attachmentsOffCollapseAnimatorSet.start();
            } else {
                this.attachmentsOnCollapseAnimatorSet.start();
            }
        }
        int i4 = 0;
        if (messageComposerState.getSendButtonState() == 10) {
            updateSendBtn(false, false);
        } else if (messageComposerState.getSendButtonState() == 11) {
            updateSendBtn(true, false);
        } else if (messageComposerState.getSendButtonState() == 12) {
            updateSendBtn(true, true);
        }
        if (!messageComposerState.isAttachmentButtonEnabled()) {
            i4 = 8;
        }
        if (this.attachmentsIndicator.getVisibility() != i4) {
            updateAttachmentButtonPosition();
            this.attachmentsIndicator.setVisibility(i4);
        }
        if (messageComposerState.isAttachmentButtonEnabled() && this.attachmentsIndicator.getAttachmentsCount() == 0) {
            this.attachmentsIndicator.enableActiveState(messageComposerState.isAttachmentButtonActivated());
            this.attachmentsIndicator.setBottomBorderVisible(messageComposerState.isAttachmentButtonActivated());
        }
    }

    private void bindViews() {
        this.inputTextField = (EditText) findViewById(R.id.message_composer_input_text);
        this.attachmentsIndicator = (ViewAttachmentsIndicator) findViewById(R.id.message_composer_attachments_indicator);
        this.sendButton = (ImageView) findViewById(R.id.message_composer_send_btn);
    }

    private void initAnimationsAndAdjustLeftMargin() {
        Resources resources = getResources();
        int integer = resources.getInteger(R.integer.zs_request_message_composer_animation_duration);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.zs_request_message_composer_collapsed_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.zs_request_message_composer_expanded_min_height);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.zs_request_message_composer_expanded_side_margin);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.zs_request_message_composer_collapsed_side_margin);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.zs_request_message_composer_expanded_top_padding);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(R.dimen.zs_request_message_composer_collapsed_top_padding);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.zs_request_message_composer_expanded_bottom_padding);
        this.attachmentsOnExpandAnimatorSet = new AnimatorSet();
        this.attachmentsOffExpandAnimatorSet = new AnimatorSet();
        this.attachmentsOnCollapseAnimatorSet = new AnimatorSet();
        this.attachmentsOffCollapseAnimatorSet = new AnimatorSet();
        P1.a aVar = new P1.a(2);
        P1.a aVar2 = new P1.a(1);
        this.attachmentsOnExpandAnimatorSet.setInterpolator(aVar);
        this.attachmentsOffExpandAnimatorSet.setInterpolator(aVar);
        this.attachmentsOnCollapseAnimatorSet.setInterpolator(aVar2);
        this.attachmentsOffCollapseAnimatorSet.setInterpolator(aVar2);
        this.attachmentsOnExpandAnimatorSet.play(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize, dimensionPixelSize2, integer)).with(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize4, dimensionPixelSize3, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize6, dimensionPixelSize5, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, 0, dimensionPixelOffset, integer));
        this.attachmentsOnCollapseAnimatorSet.play(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize4, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize5, dimensionPixelSize6, integer)).with(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize2, dimensionPixelSize, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, dimensionPixelOffset, 0, integer));
        this.attachmentsOffExpandAnimatorSet.play(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize, dimensionPixelSize2, integer)).with(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize3, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize6, dimensionPixelSize5, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, 0, dimensionPixelOffset, integer));
        this.attachmentsOffCollapseAnimatorSet.play(UtilsAnimation.sideMarginsAnimator(this.inputTextField, dimensionPixelSize3, dimensionPixelSize3, integer)).with(UtilsAnimation.topPaddingAnimator(this.inputTextField, dimensionPixelSize5, dimensionPixelSize6, integer)).with(UtilsAnimation.minHeightAnimator(this.inputTextField, dimensionPixelSize2, dimensionPixelSize, integer)).with(UtilsAnimation.bottomPaddingAnimator(this.inputTextField, dimensionPixelOffset, 0, integer));
        updateAttachmentButtonPosition();
    }

    private void initListener() {
        this.attachmentsIndicator.setOnClickListener(this);
        this.sendButton.setOnClickListener(this);
        this.inputTextField.addTextChangedListener(this);
        this.inputTextField.setOnEditorActionListener(this);
        this.inputTextField.setOnFocusChangeListener(this);
        addOnLayoutChangeListener(this);
    }

    private boolean isExpanded() {
        if (this.inputTextField.getHeight() > this.inputTextField.getResources().getDimensionPixelSize(R.dimen.zs_request_message_composer_collapsed_height)) {
            return true;
        }
        return false;
    }

    private void notifyAddAttachmentsRequested() {
        Iterator<InputListener> it = this.inputListenerList.iterator();
        while (it.hasNext()) {
            it.next().onAddAttachmentsRequested();
        }
    }

    private void notifyOnFocusChangeListeners(View view, boolean z2) {
        Iterator<View.OnFocusChangeListener> it = this.onFocusChangeListenerList.iterator();
        while (it.hasNext()) {
            it.next().onFocusChange(view, z2);
        }
    }

    private void notifySendMessageRequested(String str) {
        Iterator<InputListener> it = this.inputListenerList.iterator();
        while (it.hasNext()) {
            it.next().onSendMessageRequested(str);
        }
    }

    private void updateAttachmentButtonPosition() {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.zs_request_message_composer_expanded_side_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.zs_request_message_composer_collapsed_side_margin);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.inputTextField.getLayoutParams();
        if (!this.isAttachmentsButtonDisabled) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        layoutParams.leftMargin = dimensionPixelSize;
        this.inputTextField.setLayoutParams(layoutParams);
    }

    private void updateSendBtn(boolean z2, boolean z10) {
        int resolveColor;
        boolean z11;
        Context context = getContext();
        if (z10) {
            resolveColor = UiUtils.themeAttributeToColor(R.attr.colorPrimary, context, R.color.zs_request_fallback_color_primary);
        } else {
            resolveColor = UiUtils.resolveColor(R.color.zs_request_message_composer_send_btn_color_inactive, context);
        }
        ImageView imageView = this.sendButton;
        int i4 = 0;
        if (z2 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        imageView.setEnabled(z11);
        ImageView imageView2 = this.sendButton;
        if (!z2) {
            i4 = 4;
        }
        imageView2.setVisibility(i4);
        UiUtils.setTint(resolveColor, this.sendButton.getDrawable(), this.sendButton);
    }

    private void viewInit(Context context) {
        View.inflate(context, R.layout.zs_view_request_message_composer, this);
        if (isInEditMode()) {
            return;
        }
        bindViews();
        initListener();
        initAnimationsAndAdjustLeftMargin();
        this.stateHelper = new MessageComposerStateHelper();
    }

    public void addListener(InputListener inputListener) {
        this.inputListenerList.add(inputListener);
    }

    public void addOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.onFocusChangeListenerList.add(onFocusChangeListener);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        triggerStateUpdate();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            this.inputTextField.clearFocus();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public void enableAttachmentsButton(boolean z2) {
        this.isAttachmentsButtonDisabled = !z2;
        triggerStateUpdate();
    }

    public void enableSendButton(boolean z2) {
        this.isSendButtonDisabled = !z2;
        triggerStateUpdate();
    }

    public String getMessage() {
        return this.inputTextField.getText().toString();
    }

    public void hide(boolean z2) {
        if (z2) {
            setVisibility(8);
            this.onHeightChangeListener.onHeightChange(0);
        } else {
            setVisibility(0);
            requestLayout();
        }
    }

    public void init() {
        triggerStateUpdate();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == this.attachmentsIndicator.getId()) {
            applyState(this.stateHelper.onAttachmentClicked(this.isSendButtonDisabled, this.isAttachmentsButtonDisabled, this.inputTextField, this.attachmentsIndicator));
            notifyAddAttachmentsRequested();
        } else if (view.getId() == this.sendButton.getId()) {
            String trim = this.inputTextField.getText().toString().trim();
            this.inputTextField.setText("");
            this.attachmentsIndicator.reset();
            triggerStateUpdate();
            notifySendMessageRequested(trim);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
        if (textView.getId() == this.inputTextField.getId() && i4 == 6) {
            this.inputTextField.clearFocus();
            UiUtils.dismissKeyboard(this.inputTextField);
            triggerStateUpdate();
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z2) {
        if (view.getId() == this.inputTextField.getId()) {
            notifyOnFocusChangeListeners(view, z2);
            triggerStateUpdate();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i4, int i5, int i10, int i11, int i12, int i13, int i14, int i15) {
        OnHeightChangeListener onHeightChangeListener;
        int i16 = i11 - i5;
        if (i16 != i15 - i13 && (onHeightChangeListener = this.onHeightChangeListener) != null) {
            onHeightChangeListener.onHeightChange(i16);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
    }

    public void removeAllListener() {
        this.inputListenerList.clear();
    }

    public void requestFocusForInput() {
        this.inputTextField.requestFocus();
    }

    public void setAttachmentsCount(int i4) {
        this.attachmentsIndicator.setAttachmentsCount(i4);
        triggerStateUpdate();
    }

    public void setOnHeightChangeListener(OnHeightChangeListener onHeightChangeListener) {
        this.onHeightChangeListener = onHeightChangeListener;
    }

    public void triggerStateUpdate() {
        applyState(this.stateHelper.getState(this.inputTextField, this.attachmentsIndicator, this.isSendButtonDisabled, this.isAttachmentsButtonDisabled));
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onFocusChangeListenerList = new LinkedList();
        this.inputListenerList = new LinkedList();
        this.isSendButtonDisabled = true;
        this.isAttachmentsButtonDisabled = true;
        viewInit(context);
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.onFocusChangeListenerList = new LinkedList();
        this.inputListenerList = new LinkedList();
        this.isSendButtonDisabled = true;
        this.isAttachmentsButtonDisabled = true;
        viewInit(context);
    }

    public ViewMessageComposer(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.onFocusChangeListenerList = new LinkedList();
        this.inputListenerList = new LinkedList();
        this.isSendButtonDisabled = true;
        this.isAttachmentsButtonDisabled = true;
        viewInit(context);
    }

    public ViewMessageComposer(Context context, ViewAttachmentsIndicator viewAttachmentsIndicator, EditText editText, ImageView imageView, AnimatorSet animatorSet, AnimatorSet animatorSet2, AnimatorSet animatorSet3, AnimatorSet animatorSet4) {
        super(context);
        this.onFocusChangeListenerList = new LinkedList();
        this.inputListenerList = new LinkedList();
        this.isSendButtonDisabled = true;
        this.isAttachmentsButtonDisabled = true;
        this.attachmentsIndicator = viewAttachmentsIndicator;
        this.inputTextField = editText;
        this.sendButton = imageView;
        this.attachmentsOnExpandAnimatorSet = animatorSet;
        this.attachmentsOffExpandAnimatorSet = animatorSet3;
        this.attachmentsOnCollapseAnimatorSet = animatorSet2;
        this.attachmentsOffCollapseAnimatorSet = animatorSet4;
        this.stateHelper = new MessageComposerStateHelper();
    }
}
