package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import id.C1915c;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import t6.AbstractC3056s3;
import w1.AbstractC3233a;

/* loaded from: classes3.dex */
public class SearchView extends LinearLayoutCompat implements an.c {
    static final boolean DBG = false;
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    static final String LOG_TAG = "SearchView";
    static final L0 PRE_API_29_HIDDEN_METHOD_INVOKER;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private I0 mOnCloseListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private J0 mOnQueryChangeListener;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View.OnClickListener mOnSearchClickListener;
    private K0 mOnSuggestionListener;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    final SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    AbstractC3233a mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private O0 mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public boolean red;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.red = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" isIconified=");
            return Q0.c.romeo(sb2, this.red, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeValue(Boolean.valueOf(this.red));
        }
    }

    /* loaded from: classes3.dex */
    public static class SearchAutoComplete extends C0478s {

        /* renamed from: a, reason: collision with root package name */
        public final N0 f2824a;
        public int teal;
        public SearchView white;
        public boolean yellow;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2824a = new N0(this);
            this.teal = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return Barcode.FORMAT_QR_CODE;
            }
            if (i4 < 600) {
                if (i4 < 640 || i5 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void alpha() {
            if (Build.VERSION.SDK_INT >= 29) {
                H0.bravo(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            L0 l02 = SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER;
            l02.getClass();
            L0.alpha();
            Method method = l02.charlie;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.teal > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.C0478s, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.yellow) {
                N0 n02 = this.f2824a;
                removeCallbacks(n02);
                post(n02);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i4, Rect rect) {
            super.onFocusChanged(z2, i4, rect);
            this.white.onTextFocusChanged();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.white.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.white.hasFocus() && getVisibility() == 0) {
                this.yellow = true;
                if (SearchView.isLandscapeMode(getContext())) {
                    alpha();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            N0 n02 = this.f2824a;
            if (!z2) {
                this.yellow = false;
                removeCallbacks(n02);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.yellow = false;
                    removeCallbacks(n02);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.yellow = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.white = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.teal = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.appcompat.widget.L0, java.lang.Object] */
    static {
        L0 l02 = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.alpha = null;
            obj.bravo = null;
            obj.charlie = null;
            L0.alpha();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                obj.alpha = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                obj.bravo = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.charlie = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            l02 = obj;
        }
        PRE_API_29_HIDDEN_METHOD_INVOKER = l02;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i4, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i4 != 0) {
            intent.putExtra("action_key", i4);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i4, String str) {
        int i5;
        Uri parse;
        String hotel;
        try {
            int i10 = R0.f2808q;
            String hotel2 = R0.hotel(cursor, cursor.getColumnIndex("suggest_intent_action"));
            if (hotel2 == null) {
                hotel2 = this.mSearchable.getSuggestIntentAction();
            }
            if (hotel2 == null) {
                hotel2 = "android.intent.action.SEARCH";
            }
            String str2 = hotel2;
            String hotel3 = R0.hotel(cursor, cursor.getColumnIndex("suggest_intent_data"));
            if (hotel3 == null) {
                hotel3 = this.mSearchable.getSuggestIntentData();
            }
            if (hotel3 != null && (hotel = R0.hotel(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                hotel3 = hotel3 + "/" + Uri.encode(hotel);
            }
            if (hotel3 == null) {
                parse = null;
            } else {
                parse = Uri.parse(hotel3);
            }
            return createIntent(str2, parse, R0.hotel(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), R0.hotel(cursor, cursor.getColumnIndex("suggest_intent_query")), i4, str);
        } catch (RuntimeException e) {
            try {
                i5 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i5 = -1;
            }
            Log.w(LOG_TAG, "Search suggestions cursor at row " + i5 + " returned exception.", e);
            return null;
        }
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i4;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i4 = searchableInfo.getVoiceMaxResults();
        } else {
            i4 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i4);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        String flattenToShortString;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            flattenToShortString = null;
        } else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    private void getChildBoundsWithinSearchView(View view, Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int[] iArr = this.mTemp;
        int i4 = iArr[1];
        int[] iArr2 = this.mTemp2;
        int i5 = i4 - iArr2[1];
        int i10 = iArr[0] - iArr2[0];
        rect.set(i10, i5, view.getWidth() + i10, view.getHeight() + i5);
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        if (this.mIconifiedByDefault && this.mSearchHintIcon != null) {
            int textSize = (int) (this.mSearchSrcTextView.getTextSize() * 1.25d);
            this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private boolean hasVoiceSearch() {
        Intent intent;
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.mVoiceWebSearchIntent;
            } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
                intent = this.mVoiceAppSearchIntent;
            } else {
                intent = null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLandscapeMode(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private boolean isSubmitAreaEnabled() {
        if ((this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified()) {
            return true;
        }
        return false;
    }

    private void launchIntent(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e(LOG_TAG, "Failed launch activity: " + intent, e);
            }
        }
    }

    private boolean launchSuggestion(int i4, int i5, String str) {
        Cursor cursor = this.mSuggestionsAdapter.red;
        if (cursor != null && cursor.moveToPosition(i4)) {
            launchIntent(createIntentFromSuggestion(cursor, i5, str));
            return true;
        }
        return false;
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    private void rewriteQueryFromSuggestion(int i4) {
        Editable text = this.mSearchSrcTextView.getText();
        Cursor cursor = this.mSuggestionsAdapter.red;
        if (cursor == null) {
            return;
        }
        if (cursor.moveToPosition(i4)) {
            String charlie = this.mSuggestionsAdapter.charlie(cursor);
            if (charlie != null) {
                setQuery(charlie);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    private void updateCloseButton() {
        boolean z2;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        int i4 = 0;
        if (isEmpty && (!this.mIconifiedByDefault || this.mExpandedInActionView)) {
            z2 = false;
        } else {
            z2 = true;
        }
        ImageView imageView = this.mCloseButton;
        if (!z2) {
            i4 = 8;
        }
        imageView.setVisibility(i4);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    private void updateQueryHint() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(getDecoratedHint(queryHint));
    }

    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        int i4 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        AbstractC3233a abstractC3233a = this.mSuggestionsAdapter;
        if (abstractC3233a != null) {
            abstractC3233a.bravo(null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            R0 r02 = new R0(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSuggestionsAdapter = r02;
            this.mSearchSrcTextView.setAdapter(r02);
            R0 r03 = (R0) this.mSuggestionsAdapter;
            if (this.mQueryRefinement) {
                i4 = 2;
            }
            r03.f2816i = i4;
        }
    }

    private void updateSubmitArea() {
        int i4;
        if (isSubmitAreaEnabled() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.mSubmitArea.setVisibility(i4);
    }

    private void updateSubmitButton(boolean z2) {
        int i4;
        if (this.mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (z2 || !this.mVoiceButtonEnabled)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.mGoButton.setVisibility(i4);
    }

    private void updateViewsVisibility(boolean z2) {
        int i4;
        int i5;
        this.mIconified = z2;
        int i10 = 8;
        if (z2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i4);
        updateSubmitButton(!isEmpty);
        View view = this.mSearchEditFrame;
        if (z2) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        view.setVisibility(i5);
        if (this.mCollapsedIcon.getDrawable() != null && !this.mIconifiedByDefault) {
            i10 = 0;
        }
        this.mCollapsedIcon.setVisibility(i10);
        updateCloseButton();
        updateVoiceButton(isEmpty);
        updateSubmitArea();
    }

    private void updateVoiceButton(boolean z2) {
        int i4 = 8;
        if (this.mVoiceButtonEnabled && !isIconified() && z2) {
            this.mGoButton.setVisibility(8);
            i4 = 0;
        }
        this.mVoiceButton.setVisibility(i4);
    }

    public void adjustDropDownSizeAndPosition() {
        int i4;
        boolean z2 = true;
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean z10 = m1.alpha;
            int i5 = 0;
            if (getLayoutDirection() != 1) {
                z2 = false;
            }
            if (this.mIconifiedByDefault) {
                i5 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            }
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            if (z2) {
                i4 = -rect.left;
            } else {
                i4 = paddingLeft - (rect.left + i5);
            }
            this.mSearchSrcTextView.setDropDownHorizontalOffset(i4);
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + i5) - paddingLeft);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mClearingFocus = false;
    }

    public void forceSuggestionQuery() {
        if (Build.VERSION.SDK_INT >= 29) {
            H0.alpha(this.mSearchSrcTextView);
            return;
        }
        L0 l02 = PRE_API_29_HIDDEN_METHOD_INVOKER;
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        l02.getClass();
        L0.alpha();
        Method method = l02.alpha;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        L0 l03 = PRE_API_29_HIDDEN_METHOD_INVOKER;
        SearchAutoComplete searchAutoComplete2 = this.mSearchSrcTextView;
        l03.getClass();
        L0.alpha();
        Method method2 = l03.bravo;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, null);
            } catch (Exception unused2) {
            }
        }
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.mSearchable.getHintId());
        }
        return this.mDefaultQueryHint;
    }

    public int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    public int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public AbstractC3233a getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    public void launchQuerySearch(int i4, String str, String str2) {
        getContext().startActivity(createIntent("android.intent.action.SEARCH", null, null, str2, i4, str));
    }

    @Override // an.c
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    @Override // an.c
    public void onActionViewExpanded() {
        if (this.mExpandedInActionView) {
            return;
        }
        this.mExpandedInActionView = true;
        int imeOptions = this.mSearchSrcTextView.getImeOptions();
        this.mCollapsedImeOptions = imeOptions;
        this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
        this.mSearchSrcTextView.setText("");
        setIconified(false);
    }

    public void onCloseClicked() {
        if (TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            if (this.mIconifiedByDefault) {
                clearFocus();
                updateViewsVisibility(true);
                return;
            }
            return;
        }
        this.mSearchSrcTextView.setText("");
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    public boolean onItemClicked(int i4, int i5, String str) {
        launchSuggestion(i4, 0, null);
        this.mSearchSrcTextView.setImeVisibility(false);
        dismissSuggestions();
        return true;
    }

    public boolean onItemSelected(int i4) {
        rewriteQueryFromSuggestion(i4);
        return true;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        if (z2) {
            getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            Rect rect = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect2 = this.mSearchSrcTextViewBounds;
            rect.set(rect2.left, 0, rect2.right, i11 - i5);
            O0 o02 = this.mTouchDelegate;
            if (o02 == null) {
                O0 o03 = new O0(this.mSearchSrcTextView, this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
                this.mTouchDelegate = o03;
                setTouchDelegate(o03);
                return;
            }
            Rect rect3 = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect4 = this.mSearchSrcTextViewBounds;
            o02.bravo.set(rect3);
            Rect rect5 = o02.delta;
            rect5.set(rect3);
            int i12 = -o02.echo;
            rect5.inset(i12, i12);
            o02.charlie.set(rect4);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i4, int i5) {
        int i10;
        if (isIconified()) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i10 = this.mMaxWidth) > 0) {
                    size = Math.min(i10, size);
                }
            } else {
                size = this.mMaxWidth;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i11 = this.mMaxWidth;
            size = i11 > 0 ? Math.min(i11, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.alpha);
        updateViewsVisibility(savedState.red);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.appcompat.widget.SearchView$SavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.red = isIconified();
        return absSavedState;
    }

    public void onSearchClicked() {
        updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            J0 j02 = this.mOnQueryChangeListener;
            if (j02 == null || !j02.onQueryTextSubmit(text.toString())) {
                if (this.mSearchable != null) {
                    launchQuerySearch(0, null, text.toString());
                }
                this.mSearchSrcTextView.setImeVisibility(false);
                dismissSuggestions();
            }
        }
    }

    public boolean onSuggestionsKey(View view, int i4, KeyEvent keyEvent) {
        int length;
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i4 != 66 && i4 != 84 && i4 != 61) {
                if (i4 != 21 && i4 != 22) {
                    if (i4 == 19) {
                        this.mSearchSrcTextView.getListSelection();
                        return false;
                    }
                } else {
                    if (i4 == 21) {
                        length = 0;
                    } else {
                        length = this.mSearchSrcTextView.length();
                    }
                    this.mSearchSrcTextView.setSelection(length);
                    this.mSearchSrcTextView.setListSelection(0);
                    this.mSearchSrcTextView.clearListSelection();
                    this.mSearchSrcTextView.alpha();
                    return true;
                }
            } else {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
            }
        }
        return false;
    }

    public void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        updateSubmitButton(!isEmpty);
        updateVoiceButton(isEmpty);
        updateCloseButton();
        updateSubmitArea();
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(charSequence, this.mOldQueryText)) {
            this.mOnQueryChangeListener.onQueryTextChange(charSequence.toString());
        }
        this.mOldQueryText = charSequence.toString();
    }

    public void onTextFocusChanged() {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    public void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w(LOG_TAG, "Could not find voice search activity");
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        postUpdateFocusedState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i4, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (!isIconified()) {
            boolean requestFocus = this.mSearchSrcTextView.requestFocus(i4, rect);
            if (requestFocus) {
                updateViewsVisibility(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i4, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.mIconifiedByDefault == z2) {
            return;
        }
        this.mIconifiedByDefault = z2;
        updateViewsVisibility(z2);
        updateQueryHint();
    }

    public void setImeOptions(int i4) {
        this.mSearchSrcTextView.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.mSearchSrcTextView.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.mMaxWidth = i4;
        requestLayout();
    }

    public void setOnCloseListener(I0 i02) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(J0 j02) {
        this.mOnQueryChangeListener = j02;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(K0 k02) {
    }

    public void setQuery(CharSequence charSequence, boolean z2) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.mUserQuery = charSequence;
        }
        if (!z2 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        onSubmitQuery();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        int i4;
        this.mQueryRefinement = z2;
        AbstractC3233a abstractC3233a = this.mSuggestionsAdapter;
        if (abstractC3233a instanceof R0) {
            R0 r02 = (R0) abstractC3233a;
            if (z2) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            r02.f2816i = i4;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (searchableInfo != null) {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        boolean hasVoiceSearch = hasVoiceSearch();
        this.mVoiceButtonEnabled = hasVoiceSearch;
        if (hasVoiceSearch) {
            this.mSearchSrcTextView.setPrivateImeOptions("nm");
        }
        updateViewsVisibility(isIconified());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.mSubmitButtonEnabled = z2;
        updateViewsVisibility(isIconified());
    }

    public void setSuggestionsAdapter(AbstractC3233a abstractC3233a) {
        this.mSuggestionsAdapter = abstractC3233a;
        this.mSearchSrcTextView.setAdapter(abstractC3233a);
    }

    public void updateFocusedState() {
        int[] iArr;
        if (this.mSearchSrcTextView.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new B0(this, 1);
        this.mReleaseCursorRunnable = new B0(this, 0);
        this.mOutsideDrawablesCache = new WeakHashMap<>();
        E0 e02 = new E0(this);
        this.mOnClickListener = e02;
        this.mTextKeyListener = new F0(this);
        G0 g02 = new G0(this);
        this.mOnEditorActionListener = g02;
        ar arVar = new ar(1, this);
        this.mOnItemClickListener = arVar;
        C0452e0 c0452e0 = new C0452e0(1, this);
        this.mOnItemSelectedListener = c0452e0;
        this.mTextWatcher = new A0(this);
        int[] iArr = aj.a.victor;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        C1915c c1915c = new C1915c(context, obtainStyledAttributes);
        s1.au.mike(this, context, iArr, attributeSet, obtainStyledAttributes, i4);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.mSearchSrcTextView = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.mSearchEditFrame = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.mSearchPlate = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.mSubmitArea = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.mSearchButton = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.mGoButton = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.mCloseButton = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.mVoiceButton = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.mCollapsedIcon = imageView5;
        findViewById.setBackground(c1915c.oscar(20));
        findViewById2.setBackground(c1915c.oscar(25));
        imageView.setImageDrawable(c1915c.oscar(23));
        imageView2.setImageDrawable(c1915c.oscar(15));
        imageView3.setImageDrawable(c1915c.oscar(12));
        imageView4.setImageDrawable(c1915c.oscar(28));
        imageView5.setImageDrawable(c1915c.oscar(23));
        this.mSearchHintIcon = c1915c.oscar(22);
        AbstractC3056s3.alpha(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.mSuggestionRowLayout = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(e02);
        imageView3.setOnClickListener(e02);
        imageView2.setOnClickListener(e02);
        imageView4.setOnClickListener(e02);
        searchAutoComplete.setOnClickListener(e02);
        searchAutoComplete.addTextChangedListener(this.mTextWatcher);
        searchAutoComplete.setOnEditorActionListener(g02);
        searchAutoComplete.setOnItemClickListener(arVar);
        searchAutoComplete.setOnItemSelectedListener(c0452e0);
        searchAutoComplete.setOnKeyListener(this.mTextKeyListener);
        searchAutoComplete.setOnFocusChangeListener(new C0(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.mDefaultQueryHint = obtainStyledAttributes.getText(14);
        this.mQueryHint = obtainStyledAttributes.getText(21);
        int i5 = obtainStyledAttributes.getInt(6, -1);
        if (i5 != -1) {
            setImeOptions(i5);
        }
        int i10 = obtainStyledAttributes.getInt(5, -1);
        if (i10 != -1) {
            setInputType(i10);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        c1915c.xray();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.mDropDownAnchor = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new D0(this));
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}
