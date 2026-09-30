package zendesk.classic.messaging.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.S;
import androidx.recyclerview.widget.r;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import zendesk.classic.messaging.EventFactory;
import zendesk.classic.messaging.EventListener;
import zendesk.classic.messaging.R;
import zendesk.commonui.AlmostRealProgressBar;
import zendesk.commonui.InsetType;
import zendesk.commonui.SystemWindowInsets;

/* loaded from: classes.dex */
public class MessagingView extends CoordinatorLayout {
    public static final long DEFAULT_ANIMATION_DURATION = TimeUnit.MILLISECONDS.toMillis(300);
    private final CellListAdapter cellListAdapter;
    private final LostConnectionBanner lostConnectionBanner;
    private final AlmostRealProgressBar progressBar;

    public MessagingView(Context context) {
        this(context, null);
    }

    public void renderState(MessagingState messagingState, MessagingCellFactory messagingCellFactory, Picasso picasso, final EventListener eventListener, final EventFactory eventFactory) {
        if (messagingState == null) {
            return;
        }
        this.cellListAdapter.submitList(messagingCellFactory.createCells(messagingState.messagingItems, messagingState.typingState, picasso, messagingState.attachmentSettings));
        if (messagingState.progressBarVisible) {
            this.progressBar.start(AlmostRealProgressBar.DONT_STOP_MOVING);
        } else {
            this.progressBar.stop(300L);
        }
        this.lostConnectionBanner.update(messagingState.connectionState);
        this.lostConnectionBanner.setOnRetryConnectionClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.MessagingView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                eventListener.onEvent(eventFactory.reconnectButtonClick());
            }
        });
    }

    public MessagingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessagingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater.from(context).inflate(R.layout.zui_view_messaging, (ViewGroup) this, true);
        this.progressBar = (AlmostRealProgressBar) findViewById(R.id.zui_progressBar);
        CellListAdapter cellListAdapter = new CellListAdapter();
        this.cellListAdapter = cellListAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.zui_recycler_view);
        SystemWindowInsets.applyWindowInsets(recyclerView, InsetType.TOP);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(cellListAdapter);
        S alpha = recyclerView.getRecycledViewPool().alpha(R.layout.zui_cell_response_options_stacked);
        alpha.bravo = 0;
        ArrayList arrayList = alpha.alpha;
        while (arrayList.size() > 0) {
            arrayList.remove(arrayList.size() - 1);
        }
        r rVar = new r();
        long j5 = DEFAULT_ANIMATION_DURATION;
        rVar.setAddDuration(j5);
        rVar.setChangeDuration(j5);
        rVar.setRemoveDuration(j5);
        rVar.setMoveDuration(j5);
        rVar.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(rVar);
        InputBox inputBox = (InputBox) findViewById(R.id.zui_input_box);
        this.lostConnectionBanner = LostConnectionBanner.create(this, recyclerView, inputBox);
        new RecyclerViewScroller(recyclerView, linearLayoutManager, this.cellListAdapter).install(inputBox);
    }
}
