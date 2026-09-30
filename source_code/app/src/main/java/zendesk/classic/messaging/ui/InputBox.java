package zendesk.classic.messaging.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zendesk.classic.messaging.R;
import zendesk.commonui.TextWatcherAdapter;
import zendesk.commonui.UiUtils;

/* loaded from: classes.dex */
public class InputBox extends FrameLayout {
    private AttachmentsIndicator attachmentsIndicator;
    private View.OnClickListener attachmentsIndicatorClickListener;
    private FrameLayout inputBox;
    private InputTextConsumer inputTextConsumer;
    private EditText inputTextField;
    private TextWatcher inputTextWatcher;
    private ImageView sendButton;
    private final List<View.OnClickListener> sendButtonClickListeners;

    /* loaded from: classes.dex */
    public interface InputTextConsumer {
        boolean onConsumeText(String str);
    }

    public InputBox(Context context) {
        super(context);
        this.sendButtonClickListeners = new ArrayList();
        viewInit(context);
    }

    private void bindViews() {
        this.inputBox = (FrameLayout) findViewById(R.id.zui_view_input_box);
        this.inputTextField = (EditText) findViewById(R.id.input_box_input_text);
        this.attachmentsIndicator = (AttachmentsIndicator) findViewById(R.id.input_box_attachments_indicator);
        this.sendButton = (ImageView) findViewById(R.id.input_box_send_btn);
    }

    private void initListeners() {
        this.inputBox.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.InputBox.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InputBox.this.inputTextField.requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) InputBox.this.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.toggleSoftInput(2, 1);
                }
            }
        });
        this.attachmentsIndicator.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.InputBox.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (InputBox.this.attachmentsIndicatorClickListener != null) {
                    InputBox.this.attachmentsIndicatorClickListener.onClick(view);
                }
            }
        });
        this.sendButton.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.InputBox.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (InputBox.this.inputTextConsumer != null && InputBox.this.inputTextConsumer.onConsumeText(InputBox.this.inputTextField.getText().toString().trim())) {
                    InputBox.this.attachmentsIndicator.reset();
                    InputBox.this.inputTextField.setText((CharSequence) null);
                }
                Iterator it = InputBox.this.sendButtonClickListeners.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
            }
        });
        this.inputTextField.addTextChangedListener(new TextWatcherAdapter() { // from class: zendesk.classic.messaging.ui.InputBox.4
            @Override // zendesk.commonui.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                boolean z2;
                boolean hasLength = StringUtils.hasLength(editable.toString());
                boolean z10 = false;
                if (InputBox.this.attachmentsIndicator.getAttachmentsCount() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                InputBox inputBox = InputBox.this;
                if (hasLength || z2) {
                    z10 = true;
                }
                inputBox.updateSendBtn(z10);
                if (InputBox.this.inputTextWatcher != null) {
                    InputBox.this.inputTextWatcher.afterTextChanged(editable);
                }
            }
        });
        this.inputTextField.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zendesk.classic.messaging.ui.InputBox.5
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z2) {
                if (z2) {
                    InputBox.this.inputBox.setBackgroundResource(R.drawable.zui_background_composer_selected);
                } else {
                    InputBox.this.inputBox.setBackgroundResource(R.drawable.zui_background_composer_inactive);
                }
            }
        });
    }

    private void showAttachmentsIndicator(boolean z2) {
        if (z2) {
            this.attachmentsIndicator.setEnabled(true);
            this.attachmentsIndicator.setVisibility(0);
            updateInputFieldPosition(true);
        } else {
            this.attachmentsIndicator.setEnabled(false);
            this.attachmentsIndicator.setVisibility(8);
            updateInputFieldPosition(false);
        }
    }

    private void updateInputFieldPosition(boolean z2) {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.zui_input_box_expanded_side_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.zui_input_box_collapsed_side_margin);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.inputTextField.getLayoutParams();
        if (z2) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        layoutParams.leftMargin = dimensionPixelSize;
        this.inputTextField.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSendBtn(boolean z2) {
        int resolveColor;
        Context context = getContext();
        if (z2) {
            resolveColor = UiUtils.themeAttributeToColor(R.attr.colorPrimary, context, R.color.zui_color_primary);
        } else {
            resolveColor = UiUtils.resolveColor(R.color.zui_color_disabled, context);
        }
        this.sendButton.setEnabled(z2);
        UiUtils.setTint(resolveColor, this.sendButton.getDrawable(), this.sendButton);
    }

    private void viewInit(Context context) {
        View.inflate(context, R.layout.zui_view_input_box, this);
        if (isInEditMode()) {
            return;
        }
        bindViews();
        initListeners();
        showAttachmentsIndicator(false);
        updateSendBtn(false);
    }

    public boolean addSendButtonClickListener(View.OnClickListener onClickListener) {
        return this.sendButtonClickListeners.add(onClickListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            this.inputTextField.clearFocus();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i4, Rect rect) {
        return this.inputTextField.requestFocus();
    }

    public void setAttachmentsCount(int i4) {
        boolean z2;
        this.attachmentsIndicator.setAttachmentsCount(i4);
        boolean hasLength = StringUtils.hasLength(this.inputTextField.getText().toString());
        boolean z10 = false;
        if (this.attachmentsIndicator.getAttachmentsCount() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (hasLength || z2) {
            z10 = true;
        }
        updateSendBtn(z10);
    }

    public void setAttachmentsIndicatorClickListener(View.OnClickListener onClickListener) {
        boolean z2;
        this.attachmentsIndicatorClickListener = onClickListener;
        if (onClickListener != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        showAttachmentsIndicator(z2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        float f5;
        super.setEnabled(z2);
        this.inputTextField.setEnabled(z2);
        if (!z2) {
            this.inputTextField.clearFocus();
        }
        this.inputBox.setEnabled(z2);
        ImageView imageView = this.sendButton;
        float f10 = 0.2f;
        if (z2) {
            f5 = 1.0f;
        } else {
            f5 = 0.2f;
        }
        imageView.setAlpha(f5);
        AttachmentsIndicator attachmentsIndicator = this.attachmentsIndicator;
        if (z2) {
            f10 = 1.0f;
        }
        attachmentsIndicator.setAlpha(f10);
    }

    public void setHint(String str) {
        this.inputTextField.setHint(str);
    }

    public void setInputTextConsumer(InputTextConsumer inputTextConsumer) {
        this.inputTextConsumer = inputTextConsumer;
    }

    public void setInputTextWatcher(TextWatcher textWatcher) {
        this.inputTextWatcher = textWatcher;
    }

    public void setInputType(Integer num) {
        this.inputTextField.setInputType(num.intValue());
    }

    public InputBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.sendButtonClickListeners = new ArrayList();
        viewInit(context);
    }

    public InputBox(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.sendButtonClickListeners = new ArrayList();
        viewInit(context);
    }

    public InputBox(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.sendButtonClickListeners = new ArrayList();
        viewInit(context);
    }

    public InputBox(Context context, AttachmentsIndicator attachmentsIndicator, EditText editText, ImageView imageView) {
        super(context);
        this.sendButtonClickListeners = new ArrayList();
        this.attachmentsIndicator = attachmentsIndicator;
        this.inputTextField = editText;
        this.sendButton = imageView;
    }
}
