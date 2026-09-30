package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import s1.C2571d;
import s1.C2573f;
import s1.InterfaceC2570c;
import s1.InterfaceC2588v;
import t6.A3;
import t6.AbstractC3051r3;

/* renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0492z extends EditText implements InterfaceC2588v, androidx.core.widget.l {
    private final aa mAppCompatEmojiEditTextHelper;
    private final C0480t mBackgroundTintHelper;
    private final androidx.core.widget.j mDefaultOnReceiveContentListener;
    private C0490y mSuperCaller;
    private final ax mTextClassifierHelper;
    private final D mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, androidx.appcompat.widget.ax] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, androidx.core.widget.j] */
    public C0492z(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        T0.alpha(context);
        S0.alpha(getContext(), this);
        C0480t c0480t = new C0480t(this);
        this.mBackgroundTintHelper = c0480t;
        c0480t.delta(attributeSet, i4);
        D d4 = new D(this);
        this.mTextHelper = d4;
        d4.foxtrot(attributeSet, i4);
        d4.bravo();
        ?? obj = new Object();
        obj.alpha = this;
        this.mTextClassifierHelper = obj;
        this.mDefaultOnReceiveContentListener = new Object();
        aa aaVar = new aa(this);
        this.mAppCompatEmojiEditTextHelper = aaVar;
        aaVar.bravo(attributeSet, i4);
        initEmojiKeyListener(aaVar);
    }

    private C0490y getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new C0490y(this);
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            c0480t.alpha();
        }
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return A3.papa(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            return c0480t.bravo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            return c0480t.charlie();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.delta();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.echo();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        ax axVar;
        if (Build.VERSION.SDK_INT >= 28 || (axVar = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = axVar.bravo;
        if (textClassifier == null) {
            return aw.alpha(axVar.alpha);
        }
        return textClassifier;
    }

    public void initEmojiKeyListener(aa aaVar) {
        KeyListener keyListener = getKeyListener();
        aaVar.getClass();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener alpha = aaVar.alpha(keyListener);
            if (alpha != keyListener) {
                super.setKeyListener(alpha);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public boolean isEmojiCompatEnabled() {
        return ((L1.i) ((J2.c) this.mAppCompatEmojiEditTextHelper.bravo.purple).red).red;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r1 != null) goto L26;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] golf;
        String[] stringArray;
        InputConnection eVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && onCreateInputConnection != null) {
            u1.c.alpha(editorInfo, getText());
        }
        AbstractC3051r3.bravo(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i4 <= 30 && (golf = s1.au.golf(this)) != null) {
            if (i4 >= 25) {
                editorInfo.contentMimeTypes = golf;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", golf);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", golf);
            }
            h9.aq aqVar = new h9.aq(13, this);
            if (i4 >= 25) {
                eVar = new u1.d(onCreateInputConnection, aqVar);
            } else {
                String[] strArr = u1.c.alpha;
                if (i4 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        eVar = new u1.e(onCreateInputConnection, aqVar);
                    }
                }
            }
            onCreateInputConnection = eVar;
        }
        return this.mAppCompatEmojiEditTextHelper.charlie(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30 && i4 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i4 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i4 < 31 && i4 >= 24 && dragEvent.getLocalState() == null && s1.au.golf(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = aj.alpha(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // s1.InterfaceC2588v
    public C2573f onReceiveContent(C2573f c2573f) {
        this.mDefaultOnReceiveContentListener.getClass();
        return androidx.core.widget.j.alpha(this, c2573f);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i4) {
        ClipData primaryClip;
        InterfaceC2570c interfaceC2570c;
        int i5;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && s1.au.golf(this) != null && (i4 == 16908322 || i4 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i10 >= 31) {
                    interfaceC2570c = new com.google.android.material.internal.s(primaryClip, 1);
                } else {
                    C2571d c2571d = new C2571d();
                    c2571d.purple = primaryClip;
                    c2571d.red = 1;
                    interfaceC2570c = c2571d;
                }
                if (i4 == 16908322) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
                interfaceC2570c.mike(i5);
                s1.au.juliet(this, interfaceC2570c.mo202build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            c0480t.echo();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            c0480t.foxtrot(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.bravo();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A3.quebec(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.mAppCompatEmojiEditTextHelper.delta(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.alpha(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            c0480t.hotel(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0480t c0480t = this.mBackgroundTintHelper;
        if (c0480t != null) {
            c0480t.india(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.kilo(colorStateList);
        this.mTextHelper.bravo();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.lima(mode);
        this.mTextHelper.bravo();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        D d4 = this.mTextHelper;
        if (d4 != null) {
            d4.golf(i4, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        ax axVar;
        if (Build.VERSION.SDK_INT >= 28 || (axVar = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            axVar.bravo = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
