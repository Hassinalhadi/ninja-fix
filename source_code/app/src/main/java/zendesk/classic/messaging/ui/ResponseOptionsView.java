package zendesk.classic.messaging.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import java.util.Collections;
import java.util.WeakHashMap;
import s1.au;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.R;

/* loaded from: classes.dex */
public class ResponseOptionsView extends FrameLayout implements Updatable<ResponseOptionsViewState> {
    private static final String LOG_TAG = "ResponseOptionsView";
    private ResponseOptionsAdapter adapter;

    /* loaded from: classes.dex */
    public static class ItemOffsetDecoration extends I {
        private int itemOffset;

        public ItemOffsetDecoration(Context context, int i4) {
            this.itemOffset = context.getResources().getDimensionPixelSize(i4);
        }

        @Override // androidx.recyclerview.widget.I
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            boolean z2;
            super.getItemOffsets(rect, view, recyclerView, b0Var);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != -1) {
                if (childAdapterPosition == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                WeakHashMap weakHashMap = au.alpha;
                if (recyclerView.getLayoutDirection() == 0) {
                    if (!z2) {
                        rect.set(0, 0, this.itemOffset, 0);
                    }
                } else if (!z2) {
                    rect.set(this.itemOffset, 0, 0, 0);
                }
            }
        }
    }

    public ResponseOptionsView(Context context) {
        super(context);
        init();
    }

    private void init() {
        View.inflate(getContext(), R.layout.zui_view_response_options_content, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.zui_response_options_recycler);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, true));
        ResponseOptionsAdapter responseOptionsAdapter = new ResponseOptionsAdapter();
        this.adapter = responseOptionsAdapter;
        recyclerView.setAdapter(responseOptionsAdapter);
        recyclerView.addItemDecoration(new ItemOffsetDecoration(getContext(), R.dimen.zui_cell_response_options_horizontal_spacing));
    }

    @Override // zendesk.classic.messaging.ui.Updatable
    public void update(final ResponseOptionsViewState responseOptionsViewState) {
        responseOptionsViewState.getProps().apply(this);
        this.adapter.setResponseOptionHandler(new ResponseOptionHandler() { // from class: zendesk.classic.messaging.ui.ResponseOptionsView.1
            @Override // zendesk.classic.messaging.ui.ResponseOptionHandler
            public void onResponseOptionSelected(MessagingItem.Option option) {
                ResponseOptionsView.this.adapter.submitList(Collections.singletonList(option));
                responseOptionsViewState.getListener().onResponseOptionSelected(option);
            }
        });
        this.adapter.submitList(responseOptionsViewState.getOptions());
    }

    public ResponseOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ResponseOptionsView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
