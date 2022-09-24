package org.apache.zookeeper.inspector;

import javax.swing.tree.TreePath;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZooInspectorUtil {
  /**
   * convert TreePath to ZNodePath
   *
   * @param treePath
   * @return
   */
  public static String treePathToZnodePath(TreePath treePath) {
    if (treePath == null) {
      return null;
    }

    Object[] objects = treePath.getPath();
    if (objects.length == 1) {
      return "/";
    }

    String znodePath = "";
    for (int i = 1; i < objects.length; i++) {
      znodePath += ("/" + objects[i].toString());
    }
    return znodePath;
  }

  public static List<String> treePathToZnodePath(TreePath[] treePaths) {
    if (treePaths == null || treePaths.length == 0) {
      return Collections.emptyList();
    }

    List<String> znodePaths = new ArrayList<>();
    for (TreePath treePath : treePaths) {
      znodePaths.add(treePathToZnodePath(treePath));
    }
    return znodePaths;
  }
}
