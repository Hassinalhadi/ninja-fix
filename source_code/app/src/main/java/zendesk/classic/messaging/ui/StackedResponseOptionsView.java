package zendesk.classic.messaging.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.c;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.R;

/* loaded from: classes.dex */
public class StackedResponseOptionsView extends FrameLayout implements Updatable<ResponseOptionsViewState> {
    private ResponseOptionsAdapter adapter;

    public StackedResponseOptionsView(Context context) {
        super(context);
        init();
    }

    private void init() {
        View.inflate(getContext(), R.layout.zui_view_response_options_content, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.flexbox.c, androidx.recyclerview.widget.I, java.lang.Object] */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.zui_response_options_recycler);
        recyclerView.setItemAnimator(null);
        Context context = getContext();
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.charlie);
        obj.alpha = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        obj.bravo = 3;
        Drawable drawable = getContext().getDrawable(R.drawable.zui_view_stacked_response_options_divider);
        if (drawable != null) {
            obj.alpha = drawable;
        }
        recyclerView.setLayoutManager(new FlexboxLayoutManager(getContext()));
        recyclerView.addItemDecoration(obj);
        ResponseOptionsAdapter responseOptionsAdapter = new ResponseOptionsAdapter();
        this.adapter = responseOptionsAdapter;
        recyclerView.setAdapter(responseOptionsAdapter);
    }

    @Override // zendesk.classic.messaging.ui.Updatable
    public void update(final ResponseOptionsViewState responseOptionsViewState) {
        responseOptionsViewState.getProps().apply(this);
        this.adapter.setResponseOptionHandler(new ResponseOptionHandler() { // from class: zendesk.classic.messaging.ui.StackedResponseOptionsView.1
            @Override // zendesk.classic.messaging.ui.ResponseOptionHandler
            public void onResponseOptionSelected(MessagingItem.Option option) {
                StackedResponseOptionsView.this.adapter.setSelectedOption(option);
                responseOptionsViewState.getListener().onResponseOptionSelected(option);
            }
        });
        this.adapter.submitList(responseOptionsViewState.getOptions());
    }

    public StackedResponseOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public StackedResponseOptionsView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
