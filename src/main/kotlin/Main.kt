import javafx.scene.paint.Color
import tornadofx.*

class MyView: View() {

    private val stoplightWidth = 200.0
    private val stoplightHeight = 500.0
    private val arc = 20.0

    private val circleRadius = 60.0
    private val shift = (stoplightHeight - circleRadius * 6) / 4

    private val colors = listOf(Color.RED, Color.YELLOW, Color.GREEN)

    override val root = stackpane {
        group {
            rectangle {
                fill = Color.BLACK
                width = stoplightWidth
                height = stoplightHeight
                arcWidth = arc
                arcHeight = arc
            }

            colors.mapIndexed { i, color ->
                circle {
                    centerX = stoplightWidth / 2
                    centerY = (i + 1) * shift + (2 * i + 1) * circleRadius
                    radius = circleRadius
                    fill = color
                }
            }
        }
    }
}


class MyApp: App(MyView::class)

fun main(args: Array<String>) {
    launch<MyApp>(args)
}
