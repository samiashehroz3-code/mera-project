<script>
const images = document.querySelectorAll('img');
const lightbox = document.getElementById('lightbox');
const lightboxImg = document.getElementById('lightboxImg');

images.forEach(img => {
  img.addEventListener('click', () => {
    lightbox.style.display = 'flex';
    lightboxImg.src = img.src;
  })
});

document.getElementById('closeBtn').addEventListener('click', () => {
  lightbox.style.display = 'none';
})
</script>