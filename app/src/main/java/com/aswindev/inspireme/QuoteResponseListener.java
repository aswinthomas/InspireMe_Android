package com.aswindev.inspireme;

import java.util.List;

public interface QuoteResponseListener {
    void didFetch(List<QuoteResponse> response, String message);
    void didError(String message);
}
