package me.orly.vertexinstaller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Controller {
    @FXML
    protected void InstallButton() throws IOException {
        URL fetchWebsite = new URL("https://github.com/AstralDB/TrollageClient/raw/main/bin/latest.jar");
        ReadableByteChannel readableByteChannel = Channels.newChannel(fetchWebsite.openStream());

        try (FileOutputStream fos = new FileOutputStream(System.getenv("APPDATA")+"\\.minecraft\\mods\\vertex.jar")) {
            fos.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
        }
    }

    public void OpenGithub() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://github.com/AstralDB/TrollageClient"));;
    }
}