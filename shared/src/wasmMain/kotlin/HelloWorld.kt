import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HelloWorld(
    modifier: Modifier = Modifier
) = Box(modifier, Alignment.Center) {
    Text("Hello, World!")
}