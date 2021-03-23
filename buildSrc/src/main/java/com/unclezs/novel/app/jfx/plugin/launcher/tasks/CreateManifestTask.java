package com.unclezs.novel.app.jfx.plugin.launcher.tasks;

import com.unclezs.novel.app.jfx.plugin.launcher.LauncherExtension;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.FileFilter;

/**
 * @author blog.unclezs.com
 * @since 2021/03/23 14:13
 */
public class CreateManifestTask extends DefaultTask {
    private LauncherExtension extension;

    @TaskAction
    public void createManifest() {
        File workDir = extension.getWorkDir();
        File[] files = workDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return true;
            }
        });
    }
}
