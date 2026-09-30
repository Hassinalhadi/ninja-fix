package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import w1.AbstractC3233a;

/* loaded from: classes3.dex */
public final class R0 extends AbstractC3233a implements View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f2808q = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f2809a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2810b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f2811c;

    /* renamed from: d, reason: collision with root package name */
    public final SearchView f2812d;
    public final SearchableInfo e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2813f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakHashMap f2814g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2815h;

    /* renamed from: i, reason: collision with root package name */
    public int f2816i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f2817j;

    /* renamed from: k, reason: collision with root package name */
    public int f2818k;

    /* renamed from: l, reason: collision with root package name */
    public int f2819l;

    /* renamed from: m, reason: collision with root package name */
    public int f2820m;

    /* renamed from: n, reason: collision with root package name */
    public int f2821n;

    /* renamed from: o, reason: collision with root package name */
    public int f2822o;

    /* renamed from: p, reason: collision with root package name */
    public int f2823p;

    public R0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.purple = true;
        this.red = null;
        this.alpha = false;
        this.silver = -1;
        this.teal = new com.google.android.gms.internal.measurement.U0(this);
        this.white = new C0460i0(2, this);
        this.f2810b = suggestionRowLayout;
        this.f2809a = suggestionRowLayout;
        this.f2811c = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f2816i = 1;
        this.f2818k = -1;
        this.f2819l = -1;
        this.f2820m = -1;
        this.f2821n = -1;
        this.f2822o = -1;
        this.f2823p = -1;
        this.f2812d = searchView;
        this.e = searchableInfo;
        this.f2815h = searchView.getSuggestionCommitIconResId();
        this.f2813f = context;
        this.f2814g = weakHashMap;
    }

    public static String hotel(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    @Override // w1.AbstractC3233a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(View view, Cursor cursor) {
        int i4;
        int i5;
        int i10;
        ImageView imageView;
        Drawable foxtrot;
        Drawable foxtrot2;
        Drawable.ConstantState constantState;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        Q0 q02 = (Q0) view.getTag();
        int i11 = this.f2823p;
        if (i11 != -1) {
            i4 = cursor.getInt(i11);
        } else {
            i4 = 0;
        }
        TextView textView = q02.alpha;
        if (textView != null) {
            String hotel = hotel(cursor, this.f2818k);
            textView.setText(hotel);
            if (TextUtils.isEmpty(hotel)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f2813f;
        TextView textView2 = q02.bravo;
        if (textView2 != null) {
            String hotel2 = hotel(cursor, this.f2820m);
            if (hotel2 != null) {
                if (this.f2817j == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f2817j = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(hotel2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2817j, null), 0, hotel2.length(), 33);
                str = spannableString;
            } else {
                str = hotel(cursor, this.f2819l);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = q02.charlie;
        if (imageView2 != null) {
            int i12 = this.f2821n;
            if (i12 == -1) {
                foxtrot2 = null;
            } else {
                foxtrot2 = foxtrot(cursor.getString(i12));
                if (foxtrot2 == null) {
                    ComponentName searchActivity = this.e.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f2814g;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        if (constantState2 == null) {
                            foxtrot2 = null;
                        } else {
                            foxtrot2 = constantState2.newDrawable(context.getResources());
                        }
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder sierra = Q0.c.sierra(iconResource, "Invalid icon resource ", " for ");
                                sierra.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", sierra.toString());
                            } else {
                                foxtrot2 = drawable;
                                if (foxtrot2 != null) {
                                    constantState = null;
                                } else {
                                    constantState = foxtrot2.getConstantState();
                                }
                                weakHashMap.put(flattenToShortString, constantState);
                            }
                        }
                        foxtrot2 = null;
                        if (foxtrot2 != null) {
                        }
                        weakHashMap.put(flattenToShortString, constantState);
                    }
                    if (foxtrot2 == null) {
                        foxtrot2 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(foxtrot2);
            if (foxtrot2 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                foxtrot2.setVisible(false, false);
                foxtrot2.setVisible(true, false);
            }
        }
        ImageView imageView3 = q02.delta;
        if (imageView3 != null) {
            int i13 = this.f2822o;
            if (i13 == -1) {
                foxtrot = null;
            } else {
                foxtrot = foxtrot(cursor.getString(i13));
            }
            imageView3.setImageDrawable(foxtrot);
            if (foxtrot == null) {
                imageView3.setVisibility(8);
            } else {
                imageView3.setVisibility(0);
                foxtrot.setVisible(false, false);
                i5 = 1;
                foxtrot.setVisible(true, false);
                i10 = this.f2816i;
                imageView = q02.echo;
                if (i10 == 2 && (i10 != i5 || (i4 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
        }
        i5 = 1;
        i10 = this.f2816i;
        imageView = q02.echo;
        if (i10 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // w1.AbstractC3233a
    public final void bravo(Cursor cursor) {
        try {
            super.bravo(cursor);
            if (cursor != null) {
                this.f2818k = cursor.getColumnIndex("suggest_text_1");
                this.f2819l = cursor.getColumnIndex("suggest_text_2");
                this.f2820m = cursor.getColumnIndex("suggest_text_2_url");
                this.f2821n = cursor.getColumnIndex("suggest_icon_1");
                this.f2822o = cursor.getColumnIndex("suggest_icon_2");
                this.f2823p = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // w1.AbstractC3233a
    public final String charlie(Cursor cursor) {
        String hotel;
        String hotel2;
        if (cursor != null) {
            String hotel3 = hotel(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (hotel3 != null) {
                return hotel3;
            }
            SearchableInfo searchableInfo = this.e;
            if (searchableInfo.shouldRewriteQueryFromData() && (hotel2 = hotel(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
                return hotel2;
            }
            if (searchableInfo.shouldRewriteQueryFromText() && (hotel = hotel(cursor, cursor.getColumnIndex("suggest_text_1"))) != null) {
                return hotel;
            }
            return null;
        }
        return null;
    }

    @Override // w1.AbstractC3233a
    public final View delta(ViewGroup viewGroup) {
        View inflate = this.f2811c.inflate(this.f2809a, viewGroup, false);
        inflate.setTag(new Q0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f2815h);
        return inflate;
    }

    public final Drawable echo(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f2813f.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(P0.beige(uri, "Single path segment is not a resource ID: "));
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(P0.beige(uri, "More than two path segments: "));
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException(P0.beige(uri, "No resource found for: "));
                }
                throw new FileNotFoundException(P0.beige(uri, "No path: "));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(P0.beige(uri, "No package found for authority: "));
            }
        }
        throw new FileNotFoundException(P0.beige(uri, "No authority: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable foxtrot(String str) {
        Drawable newDrawable;
        Drawable newDrawable2;
        WeakHashMap weakHashMap = this.f2814g;
        Context context = this.f2813f;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO.equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                if (constantState == null) {
                    newDrawable2 = null;
                } else {
                    newDrawable2 = constantState.newDrawable();
                }
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    weakHashMap.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                if (constantState2 == null) {
                    newDrawable = null;
                } else {
                    newDrawable = constantState2.newDrawable();
                }
                if (newDrawable != null) {
                    return newDrawable;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e.getMessage());
                    if (drawable != null) {
                        weakHashMap.put(str, drawable.getConstantState());
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = echo(parse);
                        if (drawable != null) {
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream != null) {
                        try {
                            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                            try {
                                openInputStream.close();
                            } catch (IOException e4) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e4);
                            }
                            drawable = createFromStream;
                            if (drawable != null) {
                            }
                        } finally {
                        }
                    } else {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                }
            }
        }
        return drawable;
    }

    @Override // w1.AbstractC3233a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.f2811c.inflate(this.f2810b, viewGroup, false);
            if (inflate != null) {
                ((Q0) inflate.getTag()).alpha.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // w1.AbstractC3233a, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View delta = delta(viewGroup);
            ((Q0) delta.getTag()).alpha.setText(e.toString());
            return delta;
        }
    }

    public final Cursor golf(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(Constants.KEY_CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter(Constants.KEY_LIMIT, String.valueOf(50));
        return this.f2813f.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.red;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.red;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2812d.onQueryRefine((CharSequence) tag);
        }
    }
}
