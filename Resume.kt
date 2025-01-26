package driverassistant.ui.resume

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data object ResumeColors {
    val background: Color = Color.White
    val primary: Color = Color.Black
    val accent: Color = Color.DarkGray
    val accentLight: Color = Color.LightGray
}

data object ResumeFontSizes {
    val name: TextUnit = 44.sp
    val title: TextUnit = 30.sp
    val text: TextUnit = 22.sp
    val jobTitle: TextUnit = 22.sp
}

@Composable
fun Resume() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = ResumeColors.background)
            .padding(40.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "Amir Austine",
                style = TextStyle(
                    fontSize = ResumeFontSizes.name,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    color = ResumeColors.accent
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Divider()
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier
                        .weight(7F)
                ) {
                    ResumeTitle(title = "Career Objective")
                    ResumeText(text = "Driven and detail-oriented Android Developer with 9+ years of experience in application development, troubleshooting, and leading high-impact projects. Proven track record of enhancing user experiences and driving growth through innovative feature development and rigorous QA. Eager to leverage my expertise to contribute effectively to your company's Android team.")
                    Divider()
                    ResumeTitle(title = "Professional Experience")
                    ResumeJobPosition(position = "Android Developer")
                    ResumeJobTitle(company = "TAPSI", period = "Aug 2022 to Present")
                    ResumeText(text = "Leading Android development for a prominent online taxi service, enhancing the user experience for 20M+ users across passenger and driver applications")
                    Spacer(modifier = Modifier.padding(4.dp))
                    ResumeBullet(description = "Spearhead Android development, collaborating with stakeholders, AI experts, and cross-functional teams to define and deliver impactful features")
                    ResumeBullet(description = "Manage and mentor the Android team, focusing on career growth and skill advancement")
                    ResumeBullet(description = "Successfully increased app stability, raising the bug-free rate from 89% to 99.9%")
                    ResumeBullet(description = "Led migration from fragments and XML to Jetpack Compose")
                    Spacer(modifier = Modifier.padding(4.dp))
                    ResumeInfo(
                        title = "Technical Skills",
                        description = "Kotlin, Compose, Multi-Modular, Unit Test, Mapbox, Koin, MVVM, Git, Embrace, WebEngage, Agile, Gira, Figma"
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    ResumeInfo(
                        title = "Soft Skills",
                        description = "Cross-functional collaboration, data-driven decision-making, strategic planning, stakeholder communication, team leadership, adaptability to large-scale projects"
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Divider()
                    ResumeJobPosition(position = "Android Developer")
                    ResumeJobTitle(company = "Ghaleh Co.", period = "Sep 2015 to Aug 2022")
                    ResumeText(text = "Developed diverse mobile projects, including applications and games, contributing to user engagement and client satisfaction.")
                    Spacer(modifier = Modifier.padding(4.dp))
                    ResumeBullet(description = "Created HeyWeather app, offering customizable weather widgets, reaching over 500K users")
                    ResumeBullet(description = "Built Cafe Instagram, an app for managing Instagram accounts, achieving 500K+ downloads")
                    ResumeBullet(description = "Managed entire product lifecycle for various apps, from ideation to Google Play publishing")
                    ResumeBullet(description = "Collaborated with Android, iOS, and backend teams to deliver seamless, cross-platform functionality")
                    ResumeBullet(description = "Developed multiple small applications and games using Swift and Unity")
                    Spacer(modifier = Modifier.padding(4.dp))
                    ResumeInfo(
                        title = "Technical Skills",
                        description = "Kotlin, Java, Kotlin Multiplatform, Firebase, DataBinding, Flavor, Hilt, In-App Billing, Background Service, Theme, Multi-Language, MVVM-C, MVI, Git, Trello, Unity, Swift, SwiftUI"
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    ResumeInfo(
                        title = "Soft Skills",
                        description = "Independent project management, idea generation, versatility in small team dynamics, creative problem-solving, adaptability"
                    )

                }
                Box(
                    modifier = Modifier
                        .width(2.dp)
                        .fillMaxHeight()
                        .background(ResumeColors.accentLight)
                )
                Column(
                    modifier = Modifier.weight(3F)
                ) {
                    ResumeTitle(title = "Contact")
                    ResumeInfo(title = "Email", description = "Alwaysmda@gmail.com")
                    Spacer(modifier = Modifier.padding(4.dp))
                    ResumeInfo(title = "Phone", description = "+98 919 50 30 142")
                    Spacer(modifier = Modifier.padding(4.dp))
                    ResumeInfo(title = "LinkedIn", description = "linkedin.com/in/amir-astineh")
                    Spacer(modifier = Modifier.padding(4.dp))
                    ResumeInfo(
                        title = "Address",
                        description = "Hakimiyeh, Tehran, Tehran Province, Iran 1659918658"
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Divider()
                    ResumeTitle(title = "Education")
                    ResumeText(text = "Bachelor’s Degree in Information Technology")
                    ResumeText(text = "TAALI University")
                    Spacer(modifier = Modifier.padding(10.dp))
                    Divider()
                    ResumeTitle(title = "Languages")
                    ResumeText(text = "Persian - Native")
                    ResumeText(text = "English - B2")
                    ResumeText(text = "Korean - B1")
                    Spacer(modifier = Modifier.weight(1F))
                    ResumeLastUpdate(text = "30 Oct 2024")
                }
            }
        }
    }
}

@Composable
private fun ResumeLastUpdate(text: String) {
    Text(
        text = "Last Update: $text",
        style = TextStyle(
            fontSize = ResumeFontSizes.text,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Italic,
            color = ResumeColors.primary
        ),
        textAlign = TextAlign.Center,
        modifier = Modifier
            .alpha(0.7F)
            .fillMaxWidth()
    )
}

@Composable
private fun ResumeText(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = ResumeFontSizes.text,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Normal,
            color = ResumeColors.primary
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
private fun ResumeJobPosition(position: String) {
    Text(
        text = position,
        style = TextStyle(
            fontSize = ResumeFontSizes.jobTitle,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Medium,
            color = ResumeColors.primary
        ),
    )
}

@Composable
private fun ResumeJobTitle(company: String, period: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(bottom = 10.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = company,
            style = TextStyle(
                fontSize = ResumeFontSizes.jobTitle,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Medium,
                fontStyle = FontStyle.Italic,
                color = ResumeColors.primary
            ),
        )
        Text(
            text = period,
            style = TextStyle(
                fontSize = ResumeFontSizes.jobTitle,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Medium,
                fontStyle = FontStyle.Italic,
                color = ResumeColors.primary
            ),
        )
    }
}

@Composable
private fun ResumeBullet(description: String) {
    Row(
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .padding(bottom = 10.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "• ",
            style = TextStyle(
                fontSize = ResumeFontSizes.text,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                color = ResumeColors.primary
            ),
        )
        Text(
            text = description,
            style = TextStyle(
                fontSize = ResumeFontSizes.text,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Normal,
                color = ResumeColors.primary
            ),
        )

    }
}

@Composable
private fun ResumeInfo(title: String, description: String) {
    Text(
        text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(fontWeight = FontWeight.Bold)
            ) {
                append("$title: ")
            }
            append(description)
        },
        style = TextStyle(
            fontSize = ResumeFontSizes.text,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Normal,
            color = ResumeColors.primary
        ),
    )
}

@Composable
fun ResumeTitle(
    title: String,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(bottom = 10.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = title.uppercase(),
            style = TextStyle(
                fontSize = ResumeFontSizes.title,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                color = ResumeColors.accent,
            ),
        )
        Box(
            modifier = Modifier
                .padding(start = 20.dp)
                .clip(RoundedCornerShape(8.dp))
                .alpha(0.5F)
                .background(ResumeColors.accentLight)
                .height(35.dp)
                .weight(1F)
        )
    }
}

@Composable
private fun Divider() {
    Box(
        modifier = Modifier
            .padding(top = 10.dp, bottom = 30.dp)
            .height(2.dp)
            .background(ResumeColors.accentLight)
            .fillMaxWidth()
    )
}

@Composable
@Preview(widthDp = 1240, heightDp = 1754)
private fun ResumePreview() {
    PreviewResume()
}

@Composable
fun PreviewResume() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Resume()
    }
}