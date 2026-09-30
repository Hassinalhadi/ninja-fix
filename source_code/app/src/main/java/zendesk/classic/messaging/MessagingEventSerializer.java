package zendesk.classic.messaging;

import android.content.Context;
import ao.ad;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import zendesk.classic.messaging.Engine;
import zendesk.classic.messaging.Event;
import zendesk.classic.messaging.MessagingItem;

@MessagingScope
/* loaded from: classes.dex */
class MessagingEventSerializer {
    private static final String BOT_LABEL = " [bot]";
    private static final String LIST_ITEM_SYMBOL = "\t* ";
    private static final String NEW_LINE_CHARACTER = "\n";
    private final Context context;
    private final TimestampFactory timestampFactory;
    private static final int DEFAULT_VISITOR_NAME = R.string.zui_message_log_default_visitor_name;
    private static final int ARTICLE_SUGGESTIONS_MESSAGE = R.string.zui_message_log_article_suggestion_message;
    private static final int ARTICLE_OPENED_FORMATTER = R.string.zui_message_log_article_opened_formatter;
    private static final int TRANSFER_OPTION_SELECTION_FORMATTER = R.string.zui_message_log_transfer_option_selection_formatter;
    private static final int MESSAGE_FAILED_TO_SEND_WARNING = R.string.zui_message_log_message_failed_to_send;

    public MessagingEventSerializer(Context context, TimestampFactory timestampFactory) {
        this.context = context;
        this.timestampFactory = timestampFactory;
    }

    private String formatQuery(MessagingItem.Query query, String str) {
        String str2;
        Date timestamp = query.getTimestamp();
        String string = this.context.getString(DEFAULT_VISITOR_NAME);
        if (query.getStatus() == MessagingItem.Query.Status.FAILED) {
            str2 = this.context.getString(MESSAGE_FAILED_TO_SEND_WARNING) + " ";
        } else {
            str2 = "";
        }
        Locale locale = Locale.US;
        return formatTimestamp(timestamp) + " " + str2 + string + ": " + str;
    }

    private String formatResponse(MessagingItem.Response response, String str) {
        Date timestamp = response.getTimestamp();
        String agentUserName = getAgentUserName(response.getAgentDetails());
        Locale locale = Locale.US;
        return formatTimestamp(timestamp) + " " + agentUserName + ": " + str;
    }

    private String formatResponseWithOptions(MessagingItem.Response response, String str, List<String> list) {
        StringBuilder sb2 = new StringBuilder(str);
        for (String str2 : list) {
            sb2.append("\n\t* ");
            sb2.append(str2);
        }
        return formatResponse(response, sb2.toString());
    }

    private String formatTimestamp(Date date) {
        return this.timestampFactory.createTimestamp(date);
    }

    private String getAgentUserName(AgentDetails agentDetails) {
        StringBuilder sb2 = new StringBuilder(agentDetails.getAgentName());
        if (agentDetails.isBot()) {
            sb2.append(BOT_LABEL);
        }
        return sb2.toString();
    }

    private String serializeArticleResponse(MessagingItem.ArticlesResponse articlesResponse) {
        String string = this.context.getString(ARTICLE_SUGGESTIONS_MESSAGE);
        List<MessagingItem.ArticlesResponse.ArticleSuggestion> articleSuggestions = articlesResponse.getArticleSuggestions();
        ArrayList arrayList = new ArrayList(articleSuggestions.size());
        Iterator<MessagingItem.ArticlesResponse.ArticleSuggestion> it = articleSuggestions.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getArticleUrl());
        }
        return formatResponseWithOptions(articlesResponse, string, arrayList);
    }

    private String serializeArticleSuggestionSelectionEvent(Event.ArticleSuggestionClicked articleSuggestionClicked) {
        Date timestamp = articleSuggestionClicked.getTimestamp();
        String string = this.context.getString(ARTICLE_OPENED_FORMATTER, this.context.getString(DEFAULT_VISITOR_NAME), articleSuggestionClicked.getArticleSuggestion().getArticleUrl());
        Locale locale = Locale.US;
        return ad.amber(formatTimestamp(timestamp), " ", string);
    }

    private String serializeEndUserQuery(MessagingItem.Query query) {
        if (query instanceof MessagingItem.TextQuery) {
            return formatQuery(query, ((MessagingItem.TextQuery) query).getMessage());
        }
        if (query instanceof MessagingItem.ImageQuery) {
            return formatQuery(query, ((MessagingItem.ImageQuery) query).getRemotePath());
        }
        if (query instanceof MessagingItem.FileQuery) {
            return formatQuery(query, ((MessagingItem.FileQuery) query).getRemotePath());
        }
        return "";
    }

    private String serializeEngineSelectionEvent(Event.EngineSelection engineSelection) {
        Date timestamp = engineSelection.getTimestamp();
        String string = this.context.getString(TRANSFER_OPTION_SELECTION_FORMATTER, this.context.getString(DEFAULT_VISITOR_NAME), engineSelection.getSelectedEngine().getDisplayName());
        Locale locale = Locale.US;
        return ad.amber(formatTimestamp(timestamp), " ", string);
    }

    private String serializeEvent(Event event) {
        if (event instanceof Event.ArticleSuggestionClicked) {
            return serializeArticleSuggestionSelectionEvent((Event.ArticleSuggestionClicked) event);
        }
        if (event instanceof Event.EngineSelection) {
            return serializeEngineSelectionEvent((Event.EngineSelection) event);
        }
        return "";
    }

    private String serializeFileResponse(MessagingItem.FileResponse fileResponse) {
        return formatResponse(fileResponse, fileResponse.getRemotePath());
    }

    private String serializeImageResponse(MessagingItem.ImageResponse imageResponse) {
        return formatResponse(imageResponse, imageResponse.getRemotePath());
    }

    private String serializeMessagingItem(MessagingItem messagingItem) {
        if (messagingItem instanceof MessagingItem.Response) {
            return serializeResponse((MessagingItem.Response) messagingItem);
        }
        if (messagingItem instanceof MessagingItem.Query) {
            return serializeEndUserQuery((MessagingItem.Query) messagingItem);
        }
        return "";
    }

    private String serializeResponse(MessagingItem.Response response) {
        if (response instanceof MessagingItem.TextResponse) {
            return serializeTextResponse((MessagingItem.TextResponse) response);
        }
        if (response instanceof MessagingItem.ImageResponse) {
            return serializeImageResponse((MessagingItem.ImageResponse) response);
        }
        if (response instanceof MessagingItem.FileResponse) {
            return serializeFileResponse((MessagingItem.FileResponse) response);
        }
        if (response instanceof MessagingItem.ArticlesResponse) {
            return serializeArticleResponse((MessagingItem.ArticlesResponse) response);
        }
        if (response instanceof MessagingItem.TransferResponse) {
            return serializeTransferOptionsResponse((MessagingItem.TransferResponse) response);
        }
        return "";
    }

    private String serializeTextResponse(MessagingItem.TextResponse textResponse) {
        return formatResponse(textResponse, textResponse.getMessage());
    }

    private String serializeTransferOptionsResponse(MessagingItem.TransferResponse transferResponse) {
        String message = transferResponse.getMessage();
        List<Engine.TransferOptionDescription> engineOptions = transferResponse.getEngineOptions();
        ArrayList arrayList = new ArrayList(engineOptions.size());
        Iterator<Engine.TransferOptionDescription> it = engineOptions.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getDisplayName());
        }
        return formatResponseWithOptions(transferResponse, message, arrayList);
    }

    public String serialize(MessagingEvent messagingEvent) {
        if (messagingEvent instanceof Event) {
            return serializeEvent((Event) messagingEvent);
        }
        if (messagingEvent instanceof MessagingItem) {
            return serializeMessagingItem((MessagingItem) messagingEvent);
        }
        return "";
    }
}
