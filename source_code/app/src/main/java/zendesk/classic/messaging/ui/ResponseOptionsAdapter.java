package zendesk.classic.messaging.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0677w;
import androidx.recyclerview.widget.aq;
import androidx.recyclerview.widget.f0;
import java.util.List;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ResponseOptionsAdapter extends aq {
    private static final String LOG_TAG = "ResponseOptionsAdapter";
    private boolean canSelectOption;
    private ResponseOptionHandler responseOptionHandler;
    private MessagingItem.Option selectedOption;

    /* loaded from: classes.dex */
    public static class ResponseOptionsDiffCallback extends AbstractC0677w {
        public /* synthetic */ ResponseOptionsDiffCallback(int i4) {
            this();
        }

        private ResponseOptionsDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.AbstractC0677w
        public boolean areContentsTheSame(MessagingItem.Option option, MessagingItem.Option option2) {
            return option.equals(option2);
        }

        @Override // androidx.recyclerview.widget.AbstractC0677w
        public boolean areItemsTheSame(MessagingItem.Option option, MessagingItem.Option option2) {
            return option.equals(option2);
        }
    }

    public ResponseOptionsAdapter() {
        super(new ResponseOptionsDiffCallback(0));
        this.canSelectOption = true;
        this.selectedOption = null;
    }

    private void notifyItemChanged(MessagingItem.Option option) {
        for (int i4 = 0; i4 < getItemCount(); i4++) {
            if (((MessagingItem.Option) getItem(i4)).equals(option)) {
                notifyItemChanged(i4);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemViewType(int i4) {
        if (((MessagingItem.Option) getItem(i4)) == this.selectedOption) {
            return R.layout.zui_response_options_selected_option;
        }
        return R.layout.zui_response_options_option;
    }

    @Override // androidx.recyclerview.widget.az
    public void onBindViewHolder(final f0 f0Var, int i4) {
        TextView textView = (TextView) f0Var.itemView.findViewById(R.id.zui_response_option_text);
        final MessagingItem.Option option = (MessagingItem.Option) getItem(i4);
        textView.setText(option.getText());
        f0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.ResponseOptionsAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ResponseOptionsAdapter.this.canSelectOption) {
                    if (ResponseOptionsAdapter.this.responseOptionHandler != null) {
                        f0Var.itemView.post(new Runnable() { // from class: zendesk.classic.messaging.ui.ResponseOptionsAdapter.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ResponseOptionsAdapter.this.responseOptionHandler.onResponseOptionSelected(option);
                            }
                        });
                    }
                    ResponseOptionsAdapter.this.canSelectOption = false;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.az
    public f0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new f0(LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false)) { // from class: zendesk.classic.messaging.ui.ResponseOptionsAdapter.1
        };
    }

    public void setResponseOptionHandler(ResponseOptionHandler responseOptionHandler) {
        this.responseOptionHandler = responseOptionHandler;
    }

    public void setSelectedOption(MessagingItem.Option option) {
        this.selectedOption = option;
        notifyItemChanged(option);
    }

    @Override // androidx.recyclerview.widget.aq
    public void submitList(List<MessagingItem.Option> list) {
        super.submitList(list);
        this.canSelectOption = true;
        this.selectedOption = null;
    }
}
