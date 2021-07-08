import com.mxgraph.layout.hierarchical.mxHierarchicalLayout
import java.awt.event.ActionEvent

class SortListener(drawer: Drawer) : DrawerButtonAction(drawer) {
    override fun actionPerformed(e: ActionEvent?) {
        mxHierarchicalLayout(drawer.graph).execute(drawer.graph.defaultParent)
        drawer.paint()
    }
}