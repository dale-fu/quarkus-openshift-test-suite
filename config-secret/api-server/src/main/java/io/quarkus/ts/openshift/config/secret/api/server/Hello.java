package io.quarkus.ts.openshift.config.secret.api.server;

public class Hello {
    private final String content;

    public Hello(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

